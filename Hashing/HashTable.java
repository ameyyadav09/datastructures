import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;
class HashTable<T extends Comparable<T>> {
	private Hashtable<T, Integer> hashlist;
	private int size;
	private Node head;
	private static int count;
	HashTable (int size) {
		this.size = size;
		count = 0;
		head = null;
		hashlist = new Hashtable<T, Integer>();
	}	
	public void hashit(T value) {
		int count;
		if(hashlist.containsKey(value)) {
			count = (int)hashlist.get(value) + 1;
		}
		else
			count = 1;
			hashlist.put(value , count);
	}
	public void tree() {
		Node node;
		for(Map.Entry m:hashlist.entrySet()) {
      node = new Node((T)m.getKey(), (int)m.getValue());
    	head = insert(head , node);
    }

	}
	public Node insert(Node head , Node node) {
		if(head == null) {
			head = node;
		}
		else {
			if(node.getCount() <= head.getCount()) {
			head.setLeft(insert(head.getLeft() , node));
			}
			else if(node.getCount() > head.getCount()) {
				head.setRight(insert(head.getRight() , node));
			}
		}
		return head;
	}
	public void inorder() {
		inorder(head);
	}
	public void inorder(Node node) {
		if(node != null) {
			inorder(node.getRight());
			if(count < 100){
				count++;
				System.out.println(node.getValue() + " " +node.getCount());
			}
			inorder(node.getLeft());
		}
	}
}