class Probe<T extends Comparable<T>> {
	private Node<T> [] array;
	private Node<T> head;
	private int size;
	private int count;
	Probe(int size) {
		count = 0;
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
		return index % size;
	}
	public void insert(T key , T value) {
		if(count < size) {
			Node<T> node = new Node(key , value);
			int index = makeindex(key);
			if(array[index ] == null) {
				array[index] = node;
			}
			else {
				int temp = index + 1;
				while(temp != index) {
					if(temp > size -1) {
						temp = 0;
					}
					if(array[temp] == null) {
						array[temp] = node;
						break;
					}
					temp++;
				}
			}
			count++;
		}
		else 
			System.out.println("array is full");
	}
	public void remove(T key) {
		Node<T> node = new Node(key);
		int index = makeindex(key);
		Node temp = array[index];
		if((key.compareTo((T)temp.getKey())) == 0) {
			array[index] = null;
			resort(index + 1);
		}
		else {
			int flag = index + 1;
			temp = array[flag];
			while(temp != null) {
				if((key.compareTo((T)temp.getKey())) == 0) {
					array[flag] = null;
					count--;
					resort(flag+1);
					break;
				}
				if(flag == size - 1) {
						flag = -1;
				}
				flag++;
				temp = array[flag];
			}
		}
	}
	public void insert(Node node) {
		insert((T)node.getKey() , (T)node.getValue());
	}
	public void resort (int i) {
		int index = i;
		if(index >= size ) {
			index = 0;
		}
		Node<T> node = array[index];
		while(node != null) {
			int flag = makeindex(node.getKey());
			if(flag != index) {
				array[index] = null;
				count--;
				insert(node);
			}
			index++;
			if(index == i - 1) break;
			if(index >= size) {
				index = 0;
			}
			node = array[index];
		}
		
	}
	public void print() {
		Node temp = null;
		for( int i = 0; i < 11 ; i++) {
			temp = array[i];
			if(temp != null) {
					System.out.print(temp.getKey() + "->" + temp.getValue() + "->" + i);
					temp = temp.getLink();
				System.out.println();
			}
			else if(temp == null) {
				System.out.println("null");
			}
		}
	}
}