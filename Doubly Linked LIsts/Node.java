public class Node<T> {
	private T data;
	private Node previous;
	private Node next;
	Node () {
		data = null;
		previous = null;
		previous = null;
	}
	Node (T data) {
	this.data = data;
	previous = null;
	next = null;
	}
	Node (T data, Node previous, Node next) {
	this.data = data;
	this.previous = null;
	this.next = next;
	}
	public void setData (T data) {
	this.data = data;
	}
	public void setPrevious (Node previous) {
		this.previous = previous;
	}
	public void setNext(Node next) {
	this.next = next;
	}
	public T getData() {
	return data;
	}
	public Node getPrevious () {
		return previous;
	}
	public Node getNext () {
			return next;
	}
}