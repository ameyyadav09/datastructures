class DoublyMain {
	public static void main(String [] args) {
	DoublyLinkedMethods obj = new DoublyLinkedMethods();
	obj.insert(10);
	obj.insert(20);
	obj.insert(30);
	obj.insert(40);
	obj.print();
	// obj.insertAfter(30 , 50);
	// obj.insertBefore(50 , 60);
	// obj.pushFront(100);
	// obj.pushBack(200);
	// obj.print();
	// obj.removeElement(200);
	// obj.print();
	// obj.popBack();
	DoublyLinkedMethods obj1 = new DoublyLinkedMethods();
	obj1.insert(100);
	obj1.insert(100);
	obj1.insert(100);
	obj1.insert(100);
	obj1.print();
	obj.concatAt(obj,obj1,1);
	obj.print();
	}
}