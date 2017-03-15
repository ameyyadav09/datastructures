import java.util.StringTokenizer;
import java.util.Scanner;
class InsertionMain {
	public static void main(String [] args) {
		Integer [] array;
		Integer [] array2;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str , ",");
		int size = st.countTokens();
		array = new Integer[size];
		while(st.hasMoreTokens()) {
			array[count++] = Integer.parseInt(st.nextToken());
		}
		String str2 = sc.nextLine();
		st = new StringTokenizer(str2 , ",");
		int size2 = st.countTokens();
		array2 = new Integer[size2];
		while(st.hasMoreTokens()) {
			array2[count++] = Integer.parseInt(st.nextToken());
		}
		size = size + size2;
		Insertion s = new Insertion(size2);
		s.sort(array , array2);
	}
}