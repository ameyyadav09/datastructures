class HashMethods<T extends Comparable<T>> {
	private Node<T> [] array;
	private Node<T> head;
	HashMethods() {
		array = new Node[11];
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
		if(array[index] == null) {
			array[index] = node;
		}
		else {
			Node<T> temp = array[index];
			if(temp == null) {
				temp = node;
			}
			else {
				while(temp != null) {
					if((node.getKey().compareTo(temp.getKey())) == 0) {
						temp.setValue(node.getVal());
					}
					else {
						temp.setLink(node);
					}
						temp = temp.getLink();
				}
			}
		}
	}
	public void remove(T key) {
		int index = makeindex(key);
		Node temp1 = array[index];
		head = array[index];
		Node temp2 = temp1;
		while(temp1 != null) {
			if((key.compareTo((T)temp1.getKey())) == 0) {
				if(temp1 == null) {
					array[index] = null;
					return;
				}
				else {
					if(temp1 == head) {
						array[index] = temp1.getLink();
						return;
					}
					else {
						temp2.setLink(temp1.getLink());
						temp1 = null;return;
					}
				}
			}
			temp2 = temp1;
			temp1 = temp1.getLink();
			// System.out.println(temp1.getKey() + " " + temp2.getKey());
		}
	}
	public void print() {
		Node temp = null;
		for( int i = 0; i < 11 ; i++) {
			temp = array[i];
			if(temp != null) {
				while(temp != null) {
					System.out.print(temp.getKey() + "->" + temp.getValue() + ",");
					temp = temp.getLink();
				}
				System.out.println();
			}
		}
	}
}