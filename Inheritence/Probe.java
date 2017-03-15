class Probe<T extends Comparable<T>> {
	private Node<T> [] array;
	private Node<T> head;
	private int size;
	Probe(int size) {
		this.size = size;
		array = new Node[size];
		head = null;
	}
	public int makeindex(T key) {
		String str = key.toString();
		int index = 0;
		for( int i = 0 ; i < str.length(); i++) {
			index = index + (int)str.charAt(i);
		}
		return index % 11;
	}
	public void insert(T key , T value) {
		Node<T> node = new Node(key , value);
		int index = makeindex(key);
		// System.out.println(node.getKey() + " " + index);
		if(array[index ] == null) {
			array[index] = node;
		}
		else {
			int temp = index + 1;
			while(temp != index) {
				if(temp >= size -1) {
					temp = -1;
				}
				temp++;
				if(array[temp] == null) break;
			}
			if(temp == index) {
				System.out.println("array full");
			}
			else
				array[temp] = node;
		}
	}
	public void remove(T key) {
		Node<T> node = new Node(key);
		int index = makeindex(key);
		Node temp = array[index];
		System.out.println(index);
		if((key.compareTo((T)temp.getKey())) == 0) {
			array[index] = null;
			resort(index + 1);
		}
		else {
			int flag = index + 1;
			temp = array[flag];
			while(temp != null) {
				if(flag == size - 1) {
						flag = -1;
				}
				flag++;
				if((key.compareTo((T)temp.getKey())) == 0) {
					array[flag] = null;
					break;
				}
				temp = array[flag];
			}
		}
	}
	public void insert(Node node) {
		insert((T)node.getKey() , (T)node.getValue());
	}
	public void resort (int index) {
		if(index >= size - 1) {
			index = 0;
		}
		Node<T> node = array[index];
		int flag = makeindex((T)node.getKey());
		while(node != null) {
			if(index != flag) {
				insert(node);
				array[index] = null;
				break;
			}
			if(index >= size - 1) {
				index = -1;
			}
			index++;
			node = array[index];
			flag = makeindex((T)node.getKey());
		}
	}
	public void print() {
		Node temp = null;
		for( int i = 0; i < 11 ; i++) {
			temp = array[i];
			if(temp != null) {
					System.out.print(temp.getKey() + "->" + temp.getValue() + "->" + i + ",");
					temp = temp.getLink();
				System.out.println();
			}
			else
				System.out.println("null");
		}
	}
}