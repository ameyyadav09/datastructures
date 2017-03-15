class LinkedQueueMain {
	public static void main(String [] args ) {
		LinkedQueue obj = new LinkedQueue();
		obj.insert(10);
		obj.print();
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		obj.insert(50);
		obj.print();
		obj.delete();
		obj.print();
	}
}