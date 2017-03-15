import java.util.*;
class HashMain {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMethods hm = new HashMethods();
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			hm.insert(st.nextToken());
		}
	}
}