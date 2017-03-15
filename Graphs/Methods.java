import java.util.ArrayList;
import java.util.Collections;
class Methods<T extends Comparable<T>> {
	private ArrayList<T> nodearray;
	private int [][] darray;
	private ArrayList<Node> listArray;
	Methods(int num) {
		nodearray = new ArrayList<T>();
		darray = new int[num][num];
		listArray = new ArrayList<Node>();
	}
	public void insert(ArrayList<T> array) {
		for(int i = 0 ; i < array.size() ; i++) {
			int flag = nodearray.indexOf(array.get(i));
			if(flag == -1) {
				nodearray.add(array.get(i));
			}
		}
		Collections.sort(nodearray);
		for( int i = 1; i < array.size() ; i = i + 2) {
			int flag = nodearray.indexOf(array.get(i));
			int flag2 = nodearray.indexOf(array.get(i - 1));
			darray[flag2][flag] = 1;
		}
		
		for (int i = 0; i < nodearray.size() ; i++) {
			Node<T> node = new Node<T>(nodearray.get(i));
			listArray.add(i , node);
		}
			for(int i = 1; i < array.size() ; i = i+2 ) {
			Node<T> node = new Node<T>(array.get(i));
			int flag = nodearray.indexOf(array.get(i - 1));
			Node<T> temp1 = listArray.get(flag);
			Node<T> temp2 = temp1;
			while (temp1.getLink() != null && ((node.getVertex().compareTo(temp1.getVertex())) >= 0)) {
				temp2 = temp1;
				temp1 = temp1.getLink();
			}
			if(temp1.getLink() == null) {
				temp1.setLink(node);
			}
			else {
				if(temp1 != temp2) {
					temp2.setLink(node);
					node.setLink(temp1);
				}
				else {
					node.setLink(temp1.getLink());
					temp1.setLink(node);
				}
			}
		}
	}

	public void printMatrix() {
		System.out.print(" ");
		for( int i = 0; i < nodearray.size(); i++) {
			System.out.print(" " + nodearray.get(i));
		}
		System.out.println();
		for ( int i = 0 ; i < nodearray.size() ; i++) {
			System.out.print(nodearray.get(i) + " ");
			for( int j = 0 ; j < nodearray.size(); j++) {
				System.out.print(darray[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void printlist () {
		Node<T> temp = null;
		for(int i = 0; i < nodearray.size() ; i++ ) {
			temp = listArray.get(i);
			while(temp.getLink() != null) {
				System.out.print(temp.getVertex() + "->");
				temp = temp.getLink();
			}
			System.out.print(temp.getVertex() + "->");
			System.out.println("null");
		}
	}
}