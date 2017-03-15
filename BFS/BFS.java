import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
class BFS {
	public static void main (String [] args) {
		int j = 0, k = 0;
		Scanner sc = new Scanner(System.in);
		int vertices = Integer.parseInt(sc.nextLine());
		int [] [] array = new int [vertices + 1][vertices + 1];
		int type = Integer.parseInt(sc.nextLine());
		Methods mj = new Methods(vertices);
		if(type == 0) {
			for( int i = 0; i < vertices; i++) {
				String str = sc.nextLine();
				StringTokenizer st = new StringTokenizer(str , "->");
				boolean flag = false;
				while (st.hasMoreTokens()) {
					if(flag == false) {
						j = (Integer.parseInt(st.nextToken()));
						flag = true;
					}
					if(flag == true){
						k = (Integer.parseInt(st.nextToken()));
					}
					array[j][k] = 1;
				}
			}
			mj.bfs(array);
		}
		else if(type == 1) {
			for ( int i = 1; i <= vertices ; i++) {
				for( j = 1; j <= vertices ; j++) {
					int value = Integer.parseInt(sc.next());
					if(value == 1) {
						array[i][j] = 1;
					}
				}
			}
			mj.bfs(array);
		}
	}
}