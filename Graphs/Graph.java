import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
class Graph {
	public static void main(String [] args) {
		ArrayList array = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		Methods mj = new Methods(num);
		StringTokenizer st = new StringTokenizer(str,",() ");
		while(st.hasMoreTokens()) {
			array.add(st.nextToken());
		}
		mj.insert(array);
		mj.printMatrix();
		mj.printlist();
	}
}