class Quick<T extends Comparable<T>> {
	private T [] array;
	private int count;
	Quick(int count) {
		this.count = count;
		array = (T[]) new Comparable[count];
	}
	public void quickSort(T [] list , int low , int high) {
		if(low < high) {
			int pivot = partition(list , low , high);
			quickSort(list , low , pivot -1);
			quickSort(list , pivot + 1 , high);
		}
		array = list;
		for (int i = count - 1; i >= 0 ; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public int partition(T [] list , int low , int high) {
		int key = (low + ((high - low)/2));
		T flag = list[key];
		list[key] = list[low];
		list[low] = flag;
		T pivot = (T)(list[low]);
		do {
			while (low < high && (pivot.compareTo((T)list[high])) >= 0) {
				high--;
			}
			if(low < high) {
				T temp = list[low];
				list[low] = list[high];
				list[high] = temp;
				while(low < high && (pivot.compareTo((T)list[low])) < 0) {
					low++;
				}
				if(low < high) {
					list[high] = list[low];
				}
			}
		}while(low < high);
		list[low] = pivot;
		return low;
	}
	public void print () {
		for (int i = count - 1; i >= 0 ; i--) {
			System.out.print(array[i] + " ");
		}
	}
}