public class HeapMethods<T extends Comparable<T>> {
	private T [] array;
	private int count;
	HeapMethods() {
		array =  (T[])new Comparable[20];
		count = 1;
	}
	public void insert(T value) {
		if(count == 1) {
			array[count] = value;
		}
		else {
			array[count] = value;
			bubbleUp(count);
		}
		count++;
		print();
	}
	public void extractmin() {
			T temp = array[1];
			bubbleDown();
			count--;
			print();
		// return temp;
	}
	public void bubbleUp(int index) {
		System.out.println(index);
		int temp = index/2;
			while(index > 1 && temp > 0) {
				if(array[index].compareTo(array[temp]) <= 0) {
					T hold = array[temp];
					array[temp] = array[index];
					array[index] = hold;
					index = temp;temp = temp/2;
				}
				else {
					break;
				}
			}
			if(index == 1 && temp == 0) {
				swapDown(index);
			}
	}
	public void bubbleDown() {
		int index = 1;
		array[index] = array[count - 1];
		int ptr1 = 2 * index;
		int ptr2 = (2 * index) + 1;
		while(index < count && index > 0) {
			if(ptr1 < count && ptr2 < count ) {
			if(array[index].compareTo(array[ptr1]) > 0) {
				T hold = array[ptr1];
				array[ptr1] = array[index];
				array[index] = hold;
				if(array[index].compareTo(array[ptr2]) > 0) {
					hold = array[ptr2];
					array[ptr2] = array[index];
					array[index] = hold;
				}
			}
		}
			index++;
			ptr1 = 2 * index; ptr2 = (2 * index) + 1;
		}
	}
	public void modifyIndex(int index , T value) {
		for ( int i = 1 ; i < count ; i++) {
			if( i == index) {
				array [i] = value;
				bubbleUp(i);
			}
		}
		print();
	}
	public void swapDown( int index) {
		int ptr1 = 2 * index;
		int ptr2 = (2 * index) + 1;
		while(index < count && index > 0) {
			if(ptr1 < count && ptr2 < count ) {
			if(array[index].compareTo(array[ptr1]) > 0) {
				T hold = array[ptr1];
				array[ptr1] = array[index];
				array[index] = hold;
				if(array[index].compareTo(array[ptr2]) > 0) {
					hold = array[ptr2];
					array[ptr2] = array[index];
					array[index] = hold;
				}
			}
		}
			index++;
			ptr1 = 2 * index; ptr2 = (2 * index) + 1;
		}
	}
	public void print() {
		for (int i = 1; i < count ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}