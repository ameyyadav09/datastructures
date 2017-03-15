import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
@SuppressWarnings("unchecked")
class HashMain {
	public static void main(String [] args) throws Exception {
		int size = 10007;
		HashTable hash = new HashTable(size);
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input , " .,`~!@#$%^&*()_+-={}\":<>?\\|[]/\';");
			while(st.hasMoreTokens()) {
				String str1 = st.nextToken();
				hash.hashit(str1);
		}
		hash.tree();
		hash.inorder();
	}
}