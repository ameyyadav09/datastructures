public class Node<T> {
	private T data;
	private Node node;

	Node(T data) {
		this.data = data;
		node = null;
	}
	Node (T data , Node node) {
		this.data = data;
		this.node = node;
	}
	public void setLink (Node node) {
		this.node = node;
	}
	public void setData (T data) {
			this.data = data;
	}
	public Node getLink () {
		return node;
	}
	public T getData () {
			return data;
	}
}