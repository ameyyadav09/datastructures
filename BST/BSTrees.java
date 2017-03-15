import java.io.IOException;
import java.util.ArrayList;
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
	public Node insert(Node root , T value) {
		Node<T> node = new Node<T>(value);
		if(root == null) {
			root = node;
		}
		else {
			if(value.compareTo((T)root.getData()) < 0) {
			root.setLeft(insert(root.getLeft() , value));
		}
		else if(value.compareTo((T)root.getData()) > 0) {
			root.setRight(insert(root.getRight() , value));
		}
	}
	return root;
	}

	public boolean search (T value) {
		recCount = 0; pos = (T)root.getData();
		return search(root,value);
	}

	public boolean search (Node root , T value) {
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
		Node temp = delete(root,value);
	}
	public Node delete (Node<T> root , T value) {
		Node temp = null;
		T val;
		if(root == null) {
			return root;
		}
		else if((value.compareTo((T)root.getData())) < 0) {
			root.setLeft(delete(root.getLeft() , value));
		}
		else if((value.compareTo((T)root.getData())) > 0) {
			root.setRight(delete(root.getRight() , value));
		}
		else {
			if(root.getRight() == null && root.getLeft() == null) {
				root = null;
			}
			else if(root.getLeft() == null) {
				temp = root.getRight();
				val = (T)temp.getData();
				while(temp.getLeft() != null) {
					temp = temp.getLeft();
					if((val.compareTo((T)temp.getData())) > 0) {
						val = (T)temp.getData();
					}
				}
				root.setData(val);
				root.setRight(delete(root.getRight() , (T)temp.getData()));
			}
			else if(root.getRight() == null) {
				temp = root.getLeft();
				val = (T)temp.getData();
				while(temp.getRight() != null) {
					temp = temp.getRight();
					if((val.compareTo((T)temp.getData())) < 0) {
						val = (T)temp.getData();
					}
				}
				root.setData(val);
				root.setLeft(delete(root.getLeft() , (T)temp.getData()));
			}
			else {
				temp = root.getLeft();
				val = (T)temp.getData();
				while(temp.getRight() != null) {
					temp = temp.getRight();
					if((val.compareTo((T)temp.getData())) < 0) {
						val = (T)temp.getData();
					}
				}
				root.setData(val);
				root.setLeft(delete(root.getLeft() , (T)temp.getData()));
			}
		}
		return root;
	}

	public int getCount() {
		return recCount;
	}
	public T getPos() {
		return pos;
	}
	public void print() {
		for (int i = 0 ; i < list.size(); i++) {
			if( i == (list.size()) - 1) {
				System.out.print(list.get(i));
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
    public void inorder(Node root) {
      if (root != null) {
        inorder(root.getLeft());
        list.add(root.getData());           
        inorder(root.getRight());
      }
   }
   public void postprint() {
     list = new  ArrayList<>();
     postprint(root);
     print();
   }
   public void postprint(Node root) {
     if(root != null) {
       postprint(root.getLeft());
       postprint(root.getRight());
       list.add(root.getData());
     }
   }
}
