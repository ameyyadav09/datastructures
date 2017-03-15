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