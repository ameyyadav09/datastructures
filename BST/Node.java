class Node<T> {
	private Node left;
	private Node right;
	private T data;
	Node () {
	}
	Node (T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public void setData(T value) {
		this.data = value;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public T getData() {
		return data;
	}
	public Node getLeft() {
		return left;
	} 
	public Node getRight() {
		return right;
	}
}