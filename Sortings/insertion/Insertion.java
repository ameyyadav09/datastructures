class Insertion<T extends Comparable<T>> {
	private int count;
	Insertion(int count) {
		this.count = count;
	}
	public void sort(T [] array) {
		for( int i = 1; i < count ; i++) {
			T val = array[i];
			int key = i;
			while (key > 0 && (val.compareTo((T)array[key - 1])) < 0) {
				array[key] = array[key - 1];
				key--;
			}
			array[key] = val;
		}
		for(int i = 0 ; i < count ; i++) {
			System.out.print(array[i] + " ");
		}
	}
}