class Node<T> {
	private T key;
	private Node link;
	private T value;
	Node (T key) {
		this.key = key;
		link = null;
		value = null;
	}
	Node (T key , T val) {
		this.key = key;
		this.value = val;
		link = null;
	}
	public void setKey (T key) {
		this.key = key;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	public void setValue(T val) {
		this.value = val;
	}
	public T getKey() {
		return key;
	}
	public Node getLink() {
		return link;
	}
	public T getValue() {
		return value;
	}
}