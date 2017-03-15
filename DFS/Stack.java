class Stack {
	private int [] stackArray;
	private int count;
	private int top;
	Stack() {
		count = 20;
		top = -1;
		stackArray = new int [count];
	}
	public void push(int value) {
		if(top == count-1) {
			// System.out.println("stack full");
		}
		else {
			top++;
			stackArray[top] = value;
		}
	}
	public void pop() {
		if(isEmpty()) {
			// System.out.println("stack empty");
		}
		else {
			top--;
		}
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public int top () {
		return stackArray[top];
	}
}