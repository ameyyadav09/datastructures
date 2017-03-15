class Selection {
	private int [] finalArray;
	Selection() {
		finalArray = new int[10];
	}
	public void sort(int [] array) {
		for (int i = 0; i < array.length ; i++ ) {
			int min = 0;
			for(int j= 0; j < array.length ; j++ ) {
				if(array[min] > (array[j])) {
					min = j;
				}
			}
			finalArray[i] = array[min];
			array[min] = Integer.MAX_VALUE;
		}
		print();
	}
	private void print() {
		for (int i = 0; i < finalArray.length ; i++) {
			if(finalArray[i] != 0)
			System.out.print(finalArray[i] + " ");
		}
	}
}