class Stackbalance {
	private char[] array;
	private int top;
	private int size;
	Stackbalance(int val) {
		size = val;
		top = -1;
		array = new char[size];
	}

	public void push(char value) {
			top++;
			array[top] = value;
	}

	public void pop() {
		top--;
	}

	public char top() {
		return array[top];		
	}

	public int gettop() {
		return top;
	}
	public boolean isFull() {
		if(top == size -1 ) {
			return true;
		}
		else
			return false;
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else
			return false;
	}
}