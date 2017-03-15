import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Collections;
class SearchEngine {	
	public static void main(String[] args) {
		ArrayList<File> array = new ArrayList<File>();
		File f = new File("Demo1.txt");
		array.add(f);
		f = new File("Demo2.txt");
		array.add(f);
		f = new File("Demo3.txt");
		array.add(f);
		ArrayList<String> words = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		StringTokenizer st = new StringTokenizer(search);
		while (st.hasMoreTokens()) {
			words.add(st.nextToken());
		}
		String str;
		int i,j,k;
		int count;
		for (i = 0; i < array.size(); i++) {
			try {
				BufferedReader in = new BufferedReader(new FileReader(array.get(i).getName()));
				while((str = in.readLine()) != null) {
					for (j = 0; j < words.size(); j++) {
						count = 0;
						if(str.contains(words.get(j))) {
							array.get(i).addLine(str);
							ArrayList<String> linewords = new ArrayList<String>();
							st = new StringTokenizer(str);
							while(st.hasMoreTokens())
								linewords.add(st.nextToken());
							for(String sw : words) {
								for(String slw: linewords) {
									if(sw.equals(slw)) {
										count++;
									}
								}
							}
							array.get(i).setCount(count);
						}
					}
				}
				array.get(i).sort();
				array.get(i).calculateTotal();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		Collections.sort(array, new Compare());
		for (i = 0; i < array.size(); i++) {
			if(array.get(i).getCounts() != null) {
				System.out.println(array.get(i).getName());
			}
		}		
	}
}