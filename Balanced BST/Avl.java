import java.io.IOException;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
class Avl<T extends Comparable<T>> {
	private Node root;
	private ArrayList list;
	public T pos;
	private int recCount;
	Avl() {
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
	public int height () {
		return height(root);
	}
	public int height(Node node) {
		// System.out.println(node.getData());
		if(node == null) {
			return 0;
		}
		else {
			int left = height(node.getLeft());
			int right = height(node.getRight());
			if(left > right)
				return left + 1;
			else
				return right + 1;
		}
	}
	public void rotation (Node node) {
		if((height(node.getLeft()) - height(node.getRight())) > 1) {
			Node temp = node.getLeft();
			node.setLeft(temp.getRight());
			temp.setRight(node);
		}
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
