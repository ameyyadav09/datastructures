import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Scanner;
@SuppressWarnings("unchecked")
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
@SuppressWarnings("unchecked")
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
@SuppressWarnings("unchecked")
public class HashMain {
	public static void main(String [] args) throws Exception {
		int size = 10007;
		HashTable hash = new HashTable(size);
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input , " .,`~!@#$%^&*()_+-={}\":<>?\\|[]/\';");
			while(st.hasMoreTokens()) {
				String str1 = st.nextToken();
				hash.hashit(str1);
		}
		hash.tree();
		hash.inorder();
	}
}