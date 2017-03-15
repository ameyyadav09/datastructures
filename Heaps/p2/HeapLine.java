class HeapLine {
	public static void main(String [] args) {
	HeapMethods obj = new HeapMethods();
	obj.insert(40);
	obj.insert(20);
	obj.insert(30);
	obj.insert(50);
	obj.insert(10);
	obj.insert(25);
	obj.insert(11);
	obj.insert(1);
	obj.printArr();
	obj.sort();
	obj.print();

	}
}