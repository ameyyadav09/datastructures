class HeapMain {
	public static void main ( String [] args) {
	HeapMethods obj = new HeapMethods();
	obj.insert(15);
	obj.insert(14);
	obj.insert(13);
	obj.insert(12);
	obj.insert(16);
	obj.modifyIndex(2,10);
	obj.extractmin();
	obj.insert(17);
	obj.insert(18);
	obj.modifyIndex(1,19);
	// obj.print();
	}
}