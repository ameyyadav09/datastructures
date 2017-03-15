class Stackbalance {
	private char[] array;
	private int top;

	Stackbalance(int val) {
		top = -1;
		array = new char[val];
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
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else
			return false;
	}
}