@SuppressWarnings("unchecked")
class StackMethods<T> {
	private T array[];
	private int size;
	private int top;
	StackMethods () {
		size = 10;
		array = (T[])new Object[size];;
		top = -1;
	}
	public void push(T value) {
	if(top == size-1) {
		System.out.println("stack full");
	}
	else {
		top++;
		array[top] = value;
	}
}
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack empty");
		}
		else {
			top--;
		}
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else 
			return false;
	}
	public T top () {
		return array[top];
	}
	public void display() {
		if(!isEmpty()) {
			for ( int i = 0; i <= top ; i++) {
				System.out.println(array[i]);
			}
		}
		else
			System.out.println("stack empty");
	}
}