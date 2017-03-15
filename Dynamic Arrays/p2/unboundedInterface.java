import java.util.Scanner;
@SuppressWarnings("unchecked")
interface unboundedInterface<T> {
	public void reallocate(int newsize);
	public void pushBack(T value);
	public void popBack();
	public void sizeOf();
	public void capacityOf();
	public void print();
}
@SuppressWarnings("unchecked")
public class Methods<T> implements DynamicLists<T> {
	private T [] initialArray ;
	private int count ;
	private int size;
	Methods ( int size) {
		this.size = size;
		initialArray = (T[])new Object[size];
		count = -1;
	}

	public void growArray() {
		size = size * 2;
		T[] temp = (T[]) new Object[size];
		for ( int i = 0 ; i < count ; i++ ) {
			temp  [i] = initialArray[i];
		}
		initialArray = temp ;
	}

	public void add(T value) {
		count++;
		if(count == size) {
			growArray();
		}
		initialArray[count] = value;
	}

	public void removeIndex(int index) {
		if(index <= count) {
			initialArray[index] = null;
			for ( int i = index ; i < count ; i++) {
				initialArray[i] = initialArray[i+1];
			}
			count--;
		}
	}
	public void removeElement(T value) {
		for ( int i = 0 ; i <= count ; i++ ) {
			if( initialArray[i].equals(value)) {
				for( int j = i; j < count ; j++) {
					initialArray[i] = initialArray[i+1];
				}
				count--;
				i--;
			}
		}
	}
	public void read(int index) {
		System.out.println(initialArray[index] );
	}
	public void modifyIndex(int index, T mvalue) {
				initialArray[index] = mvalue;
	}
	public void modifyElement(T value1, T value2) {
		for ( int i = 0 ; i <= count  ; i++) {
			if(initialArray[i].equals(value1)) {
				modifyIndex(i,value2);
			}
		}
	}
	public void print() {
		for ( int i = 0; i <= count ; i++) {
			if(i < count) {
			System.out.print(initialArray[i]  + ",");
		}
		else {
			System.out.println(initialArray[i]);
		}
		}
	}
}

@SuppressWarnings("unchecked")
class UnboundedMain {
	public static void main(String [] args) {
	Scanner st = new Scanner(System.in);

	String str = "";
	int value;
	char ch = st.next().charAt(0);
	switch (ch) {
		case 'I': Unbounded ub = new Unbounded<Integer>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": value = Integer.parseInt(st.next());
																ub.pushBack(value);break;
										case "pop": ub.popBack();break;
										case "size": ub.sizeOf();break;
										case "capacity": ub.capacityOf();break;
										case "print": ub.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		case 'C':Unbounded ub1 = new Unbounded<Character>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": str = st.next();
																ub1.pushBack(str.charAt(0));break;
										case "pop": ub1.popBack();break;
										case "size": ub1.sizeOf();break;
										case "capacity": ub1.capacityOf();break;
										case "print": ub1.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		case 'S': Unbounded ub2 = new Unbounded<String>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": str = st.next();
																ub2.pushBack(str);break;
										case "pop": ub2.popBack();break;
										case "size": ub2.sizeOf();break;
										case "capacity": ub2.capacityOf();break;
										case "print": ub2.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		case 'F':	Unbounded ub3 = new Unbounded<Float>(1);
							do {
									str = st.next();
									switch (str) {
										case "push": Float val = Float.parseFloat(st.next());
																ub3.pushBack(val);break;
										case "pop": ub3.popBack();break;
										case "size": ub3.sizeOf();break;
										case "capacity": ub3.capacityOf();break;
										case "print": ub3	.print();break;
										default: break;
										}
								}while(!str.equals("end"));break;
		}
	}
}