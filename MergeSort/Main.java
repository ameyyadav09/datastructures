import java.util.StringTokenizer;
import java.util.Scanner;
class Main {
	public static void main(String [] args) {
		Integer [] array = new Integer[10];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str , ",");
		while(st.hasMoreTokens()) {
			// System.out.println(st.nextToken());
			array[count++] = Integer.parseInt(st.nextToken());
		}
		Merge s = new Merge();
		s.mergeSort(array , 0 , count - 1);
	}
}