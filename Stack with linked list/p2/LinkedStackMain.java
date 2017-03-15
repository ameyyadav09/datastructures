@SuppressWarnings("unchecked")
class LinkedStackMain<T> {
	public static void main(String [] args) {
		StackLinked obj = new StackLinked();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.display();
		obj.pop();
		obj.display();
		System.out.println(obj.top());
	}
}