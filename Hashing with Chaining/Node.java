import java.util.ArrayList;
class Node<T> {
	private T key;
	private Node link;
	private ArrayList<T> value;
	Node (T key) {
		this.key = key;
		link = null;
		value = new ArrayList();
	}
	Node (T key , T val) {
		this.key = key;
		value = new ArrayList();
		value.add(val);
		link = null;
	}
	public void setKey (T key) {
		this.key = key;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	public void setValue(T val) {
		if(value.indexOf(val) == -1) {
			value.add(val);
		}
	}
	public T getKey() {
		return key;
	}
	public Node getLink() {
		return link;
	}
	public ArrayList<T> getValue() {
		return value;
	}
	public T getVal() {
		return value.get(0);
	}
}