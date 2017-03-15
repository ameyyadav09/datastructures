class Node<T> {
	private T value;
	private Node left;
	private Node right;
	private int count;
	Node (T value) {
		this.value = value;
		left = null;
		right = null;
		count = 1;
	}
	Node (T value , int count) {
		this.value = value;
		this.count = count;
		left = null;
		right = null;
	}
	public void setValue (T value) {
		this.value = value;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public T getValue() {
		return value;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
	public int getCount() {
		return count;
	}

}