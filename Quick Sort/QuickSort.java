import java.util.Scanner;
import java.util.StringTokenizer;
class QuickSort<T extends Comparable<T>> {
	private T[] array;
	public QuickSort(T[] input ) {
		array = (T[]) new Comparable[input.length];
		array = input;
		array = quick_sort(array,0,array.length - 1);
	}
	public T[] quick_sort(T[] array, int i, int j) {
		int low = i;
		int high = j;
		int pivot = i;
		if(low < high) {
			while(low < high) {
				while(array[low].compareTo(array[pivot]) <= 0 && low < 	high) {
					low++;
				}
				while(array[high].compareTo(array[pivot]) > 0) {
					high--;
				}
				if(low < high) {
					swap(array , low , high);
				}
			}
			swap(array , high , pivot);
			quick_sort(array , i , high - 1);
			quick_sort(array , high + 1 , j);
		}
		return array;
	}
	public void swap( T list[] , int i , int j) {
		T temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	public void printA() {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
class Quick_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		Integer [] array = new Integer[count];
		count = 0;
		StringTokenizer st = new StringTokenizer(str , ",");
		while(st.hasMoreTokens()) {
			array[count++] = Integer.parseInt(st.nextToken());
		}
		QuickSort<Integer> obj = new QuickSort(array);
		obj.printA();
	}
}