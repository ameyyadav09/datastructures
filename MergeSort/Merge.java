public class Merge<T extends Comparable<T>> {
	private T[] array;
	Merge(int count) {
		array = (T[]) new Comparable[count];
	}
	public static void mergeSort(T[] list, int low, int high) {
		if (low < high) {
			int mid = (low + high)/2;
			mergeSort(list,low,mid);
			mergeSort(list,mid+1,high);
			merge(list,low,high);
		}
	}
	public static void merge(T[] list, int low, int high) {
		T[] temp = (T[])new Comparable[list.length];
		int mid = (low + high)/2;
		int index1 = 0;
		int index2 = low;
		int index3 = mid + 1;
		while (index2 <= mid && index3 <= high) {
			if ((list[index2].compareTo(list[index3])) < 0) {
				temp[index1] = list[index2];
				index1++; index2++;
			}
			else {
				temp[index1] = list[index3];
				index1++; index3++;
			}
		}
		while (index2 <= mid) {
			temp[index1] = list[index2];
			index1++; index2++;
		}
		while (index3 <= high) {
			temp[index1] = list[index3];
			index1++;	index3++;
		}
		for (int i=low, j=0; i<=high; i++, j++) {
			list[i] = temp[j];
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
