import java.util.Scanner;
import java.util.StringTokenizer;
class DFS {
	public static void main(String [] args) {
		int j = 0, k = 0;
		Scanner sc = new Scanner(System.in);
		int node = Integer.parseInt(sc.nextLine());
		int type = Integer.parseInt(sc.nextLine());
		int [] [] array = new int[node+1][node+1];
		Methods mj = new Methods(node);
		if( type == 0) {
			for( int i = 0; i < node; i++) {
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
			mj.dfs(array);
			mj.print();
		}
		else if(type == 1) {
			for(int i = 1; i <= node ; i++) {
				for(j = 1; j <= node ; j++) {
					array[i][j] = Integer.parseInt(sc.next());
				}
			}
			mj.dfs(array);
			mj.print();
		}
	}
}