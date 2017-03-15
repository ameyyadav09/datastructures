import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("unchecked")
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
@SuppressWarnings("unchecked")
class BSTrees<T extends Comparable<T>> {
	private Node root;
	private ArrayList list;
	public T pos;
	private int recCount;
	BSTrees() {
		root = null;
	}
	public void insert(T value) {
		root = insert(root , value);
	}
	private Node insert(Node root , T value) {
		Node<T> node = new Node<T>(value);
		if(root == null) {
			root = node;
		}
		else {
			if(value.compareTo((T)root.getData()) < 0) {
			root.setLeft(insert(root.getLeft() , value));
		}
		else if(value.compareTo((T)root.getData()) >= 0) {
			root.setRight(insert(root.getRight() , value));
		}
	}
	return root;
	}

	public boolean search (T value) {
		recCount = 0; pos = (T)root.getData();
		return search(root,value);
	}

	private boolean search (Node root , T value) {
		if(root != null) {
			if((value.compareTo((T)root.getData())) < 0) {
			pos = (T)root.getData();
		}
		if((value.compareTo((T)root.getData())) == 0) {
			recCount++;
			return true;
		}
		if((value.compareTo((T)root.getData())) < 0) {
			recCount++;
			return search(root.getLeft() , value);
		}
		else if((value.compareTo((T)root.getData())) > 0) {
			recCount++;
			return search(root.getRight() , value);
		}
	}
			return false;
	}

	public void delete (T value) {
		root = delete(root,value);
		postprint();
	}
	private Node delete (Node<T> node , T value) {
		Node temp = null;
		T val;
		if(node == null) {
			return node;
		}
		else if((value.compareTo((T)node.getData())) < 0) {
			node.setLeft(delete(node.getLeft() , value));
		}
		else if((value.compareTo((T)node.getData())) > 0) {
			node.setRight(delete(node.getRight() , value));
		}
		else {
			if(node.getRight() == null && node.getLeft() == null) {
				return null;
			}
			else if(node.getRight() == null) {
				temp = node.getLeft();
				val = (T)temp.getData();
				while(temp.getRight() != null) {
					temp = temp.getRight();
					if((val.compareTo((T)temp.getData())) < 0) {
						val = (T)temp.getData();
					}
				}
				node.setData(val);
				node.setLeft(delete(node.getLeft() , (T)temp.getData()));
			}
			else if(node.getLeft() == null) {
				temp = node.getRight();
				val = (T)temp.getData();
				while(temp.getLeft() != null) {
						temp = temp.getLeft();
						if((val.compareTo((T)temp.getData())) > 0) {
						val = (T)temp.getData();
					}
				}
				node.setData(val);
				node.setRight(delete(node.getRight() , (T)temp.getData()));
			}
			else {
				temp = node.getLeft();
				val = (T)temp.getData();
				while(temp.getRight() != null) {
					temp = temp.getRight();
					if((val.compareTo((T)temp.getData())) < 0) {
						val = (T)temp.getData();
					}
				}
				node.setData(val);
				node.setLeft(delete(node.getLeft() , (T)temp.getData()));
			}
		}

		return node;
	}

	public int getCount() {
		return recCount;
	}
	public void getPos(T value) {
		if(value.compareTo(pos) < 0) {
			System.out.println("false,"+pos);
		}
		else
			System.out.println("false,0");

	}
	private void print() {
		for (int i = 0 ; i < list.size(); i++) {
			if( i == (list.size()) - 1) {
				System.out.println(list.get(i));
			}
			else
				System.out.print(list.get(i) + ",");	
		}
	}
	public void inorder() {
		list = new ArrayList<>();
	    inorder(root);
	    print();
  	}
    private void inorder(Node root) {
		if (root != null) {
			inorder(root.getLeft());
			list.add(root.getData());           
			inorder(root.getRight());
		}
   	}
	public void postprint() {
	 list = new  ArrayList<>();
	 if(root != null) {
		 	postprint(root);
		    print();
		}
		else {
			System.out.println(0);
		}
	}
	private void postprint(Node root) {
		if(root != null) {
			postprint(root.getLeft());
			postprint(root.getRight());
			list.add(root.getData());
		}
	}
}
@SuppressWarnings("unchecked")
public class BSTMain<T extends Comparable<T>> {
	public static void main(String[] args) {
		BSTrees obj = new BSTrees();
    boolean result;
		Scanner sc = new Scanner(System.in);
    String command = sc.nextLine();
    String []splitCommands = command.split(",");
    for(int i = 0; i < splitCommands.length ; i ++) {
      String opr = splitCommands[i].charAt(0) + "";
      if(opr.equals("e")) {
        break;
      }
      int num = Integer.parseInt(splitCommands[i].substring(2) +"");
      if(opr.equals("I")) {
        obj.insert(num);
        obj.inorder();
      }
      if(opr.equals("R")) {
        obj.delete(num);
      }
      if(opr.equals("S")) {
      	try{
         result = obj.search(num);
	       if(result) {
	        System.out.println("true,"+obj.getCount());
	        }
	        else {
	        	obj.getPos(num);
	        }
      	}
      	catch(Exception e) {
      		System.out.println("false,0");
      	}
	}
	}
  }
}