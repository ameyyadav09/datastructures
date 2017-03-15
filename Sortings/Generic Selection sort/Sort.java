class Sort<T extends Comparable<T>> {
	private int count;
	Sort(int count) {
		this.count = count;
	}
	public void sort(T [] array) {
		for(int i = 0 ; i < count - 1 ; i++) {
			int min = i;
			for(int j = i + 1; j < count ; j++) {
				if((array[min].compareTo(array[j])) > 0) {
					min = j;
				}
			}
			if(min != i) {
				T temp = array[min];
					array[min] = array[i];
					array[i] = temp;
			}
		}
		for(int i = 0; i < count ; i++) {
			System.out.print(array[i] + " ");
		}
	}
}