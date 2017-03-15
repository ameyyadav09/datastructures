import java.util.Scanner;
import java.util.StringTokenizer;
@SuppressWarnings("unchecked")
class MaxMethods<T extends Comparable<T>> {
	private T [] array;
	private int count;
	MaxMethods() {
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
	public void extractmax() {
			T temp = array[1];
			array[1] = array[count - 1];
			bubbleDown();
			count--;
			print();
	}
	public void bubbleUp(int index) {
		int temp = index/2;
			while(index > 1 && temp > 0) {
				if(array[index].compareTo(array[temp]) >= 0) {
					swap(index,temp);
					index = temp;temp = temp/2;
				}
				else {
					break;
				}
			}
	}
	public void bubbleDown()
	{
		int parent = 1;
		int left = 2 * parent ;
		int right = (2 * parent) + 1;
		while(left < count) {
			int index = left;
			if(right < count) {
				if(array[left].compareTo(array[right]) < 0) {
					index = right;
				}
			}
			if(array[index].compareTo(array[parent]) > 0) {
				swap(index , parent);
				parent = index;
				left = parent*2;
				right = left+1;
			}
			else
				break;
		}
	}
	public void swap( int i , int j) {
		T hold = array[i];
				array[i] = array[j];
				array[j] = hold;
	}
	public void modifyIndex(int index, T value)
	{		
		if(value.compareTo(array[index])<0) {
			array[index] = value;
			bubbleDown();
		}
		else {
			array[index] = value;
			bubbleUp(index);
		}
		for(int i=1; i<count;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public void printArr() {
		for(int i=1;i<count;i++) {
			System.out.println(array[i]);
		}
	}
	public void print() {
		for (int i = 1; i < count ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
@SuppressWarnings("unchecked")
public class MaxHeap {
	public static void main ( String [] args) {
	MaxMethods obj = new MaxMethods();
	Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();
	StringTokenizer st = new StringTokenizer(line, " ,");
	while(st.hasMoreTokens())
	{
		String str = st.nextToken();
		switch(str) {
			case "i": obj.insert(Integer.parseInt(st.nextToken()));break;
			case "mo": obj.modifyIndex(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));break;
			case "d": obj.extractmax();break;
			default: break;
		}
	}
}
}