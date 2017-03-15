@SuppressWarnings("unchecked")
class LinkedMain {
	public static void main (String [] args) {
	LinkedMethods obj = new LinkedMethods();
	obj.insert(10);	obj.insert(20);	obj.insert(30);	obj.insert(40);	obj.insert(50);	obj.insert(60);
	obj.print();
	obj.removeAt(1);obj.print();
	obj.removeElement(10);obj.print();
	obj.popFront();obj.print();
	obj.popBack();obj.print();
	obj.pushFront(100);obj.print();
	obj.pushBack(200);obj.print();
	LinkedMethods obj1 = new LinkedMethods();
	obj1.insert(5);obj1.insert(15);obj1.insert(25);obj1.insert(35);
	obj1.print();
	// obj.concat(obj , obj1);obj.print();
	obj.concatAt(obj , obj1 , 3);
	obj.print();
	}
}