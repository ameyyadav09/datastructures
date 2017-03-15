@SuppressWarnings("unchecked")
class StackLinked<T> {
	private Node top;
	private int size;
	 StackLinked() {
	 	top = null;
	 	size = 0;
	 }
	 public boolean isEmpty() {
	 	if(top == null) {
	 		return true;
	 	}
	 	else
	 		return false;
	 }
	 public void push(T value) {
	 	Node<T> newo = new Node<T>(value);
		if(!isEmpty()) {
			newo.setLink(top);
			top = newo;
		}
		else {
			top = newo;
		}
		size++;
	 }
	 public void pop() {
	 	if(isEmpty()) {
	 		System.out.println("stack empty");
	 	}
	 	else {
	 		Node temp = top;
	 		top= temp.getLink();
	 		size--;
	 	}
	 }
	 public T top() {
	 	return (T)top.getData();
	 }
	 public void display() {
		Node temp = top;
		for(int i = 0; i < size ; i++) {
			System.out.print(temp.getData() + " ");
			temp = temp.getLink();
		}
		System.out.println("\n");
	}
}