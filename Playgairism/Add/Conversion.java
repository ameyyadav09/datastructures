import java.util.StringTokenizer;
import java.util.ArrayList;
class Conversion {

	public ArrayList<Integer> toTokenize(String str , int base) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp <= base) {
				array.add(temp);
			}
			else {
				System.out.println("Invalid Input");
				return null;
			}
		}
		return array;
	}

	public ArrayList<Integer> toappend(ArrayList<Integer> array , int count) {
		for ( int i = 0; i < count ; i++) {
			array.add(i,0);
		}
		return array;
	}

	public ArrayList<Integer> toAdd(ArrayList<Integer> array1, ArrayList<Integer> array2 , int base) {
		int carry = 0;
		ArrayList<Integer> sum = new ArrayList<Integer>();
		int temp ;
		for ( int i = array1.size()-1 ; i >= 0 ; i-- ) {

			temp = array1.get(i) + array2.get(i) + carry;
			carry = temp / base;
			temp = temp % base;
			sum.add(0 , temp);
			if( i == 0 && carry > 0) {
				sum.add( 0 , carry);
			}
		}
		return sum;
	}
}