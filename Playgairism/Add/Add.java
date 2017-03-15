import java.util.Scanner;
import java.util.ArrayList;
class Add {
	public static void main(String [] args ) {
		Scanner sc = new Scanner (System.in);
		String str1 = new String (sc.nextLine());
		String str2 = new String (sc.nextLine());
		int base = Integer.parseInt(sc.nextLine());

		Conversion obj = new Conversion();
		
		ArrayList<Integer> array1 = obj.toTokenize(str1 , base);
		ArrayList<Integer> array2 = obj.toTokenize(str2 , base);
		ArrayList<Integer> sum = new ArrayList<Integer>();

		if(array1 != null && array2 != null ){
			if(array1.size() < array2.size()) {
				int temp = array2.size() - array1.size();
				obj.toappend(array1, temp);
			}
			else if(array2.size() < array1.size()) {
				int temp = array1.size() - array2.size();
				obj.toappend(array2,temp);
			}
			sum = obj.toAdd(array1 , array2 , base);
			System.out.println(array2);
			System.out.println(array1);
			System.out.println(sum);
		}
	}
}