class Node<T> {
	private T vertex;
	private Node link;
	Node (T vertex) {
		this.vertex = vertex;
		this.link = null;
	}
	public void setVertex(T vertex) {
		this.vertex = vertex;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	public T getVertex() {
		return vertex;
	}
	public Node getLink () {
		return link;
	}
}