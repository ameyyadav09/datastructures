spublic class DoublyLinkedMethods<T> implements DoublyInterface<T> {
	private Node start;
	private Node end;
	private int count;
	DoublyLinkedMethods(){
		start = null;
		end = null;
		count = 0;
	}
	public void insert (T value) {
		Node<T> newo = new Node<T>(value);
		if(count == 0) {
			start = newo;
			end = start;
		}
		else {
			end.setNext(newo);
			newo.setPrevious(end);
			end = newo;
		}
		count++;
	}
	public void insertAfter(T ref , T value) {
		Node<T> newo = new Node<T>(value);
		Node temp1 = start;
		for(int i = 0 ; i < count ; i++) {
			if(temp1.getData() == ref) {
				if(temp1.getNext() == null){
					end.setNext(newo);
					newo.setPrevious(end);
					end = newo;
				}
				else {
					newo.setNext(temp1.getNext());
					newo.setPrevious(temp1);
					temp1.setNext(newo);
				}
			}
				temp1 = temp1.getNext();
		}
		count++;
	}
	public void insertBefore(T ref , T value) {
		Node<T> newo = new Node<T>(value);
		Node temp1 = start;
		Node temp2 = temp1;
		for(int i = 0 ; i < count ; i++) {
			if (temp1.getData() == ref) {
				if(temp1.getPrevious() == null) {
					temp1.setPrevious(newo);
					newo.setNext(temp1);
					start = newo;
				}
				else {
					newo.setPrevious(temp1.getPrevious());
					newo.setNext(temp1);
					temp2.setNext(newo);
					temp1.setPrevious(newo);
				}
			}
			temp2 = temp1;
			temp1 = temp1.getNext();
		}
		count++;
	}
	public void pushFront(T value) {
		Node<T> newo = new Node<T>(value);
		Node temp1 = start;
		temp1.setPrevious(newo);
		newo.setNext(temp1);
		start = newo;
		count++;
	}
	public void pushBack(T value) {
		insert(value);
	}
	public void removeElement(T value) {
		Node temp1 = start;
		Node temp2 = temp1;
		for (int i = 0 ; i < count ; i++) {
			if(temp1.getData().equals(value))	 {
				if(temp1.getPrevious() == null) {
					start = temp2.getNext();					
					count--;
				}
				else if(temp1.getNext() == null) {
					temp2.setNext(null);
					temp1.setPrevious(null);
					end = temp2;
					count--;
				}
				else {
					Node dummy = temp1.getNext();
					temp2.setNext(temp1.getNext());
					dummy.setPrevious(temp1.getPrevious());
					count--;
				}
			}
			temp2 = temp1;
			temp1 = temp1.getNext();
		}
	}
	public void removeIndex(int index) {
		Node temp1 = start;
		Node temp2 = temp1;
		for (int i = 0 ; i < count ; i++) {
			if(i == index)	 {
				if(temp1.getPrevious() == null) {
					start = temp2.getNext();					
					count--;
				}
				else if(temp1.getNext() == null) {
					temp2.setNext(null);
					temp1.setPrevious(null);
					end = temp2;
					count--;
				}
				else {
					Node dummy = temp1.getNext();
					temp2.setNext(temp1.getNext());
					dummy.setPrevious(temp1.getPrevious());
					count--;
				}
			}
			temp2 = temp1;
			temp1 = temp1.getNext();
		}
	}
	public void popFront() {
		removeIndex(0);
	}
	public void popBack() {
		removeIndex(count-1);
	}
	public void concat(DoublyLinkedMethods<T> temp1 , DoublyLinkedMethods<T> temp2) {
		temp1.end.setNext(temp2.start);
		temp2.start.setPrevious(temp1.end);
		end = temp2.end;
		temp1.count = temp1.count + temp2.count;
	}
	public void concatAt(DoublyLinkedMethods<T> obj1, DoublyLinkedMethods<T> obj2 , int index) {
		Node temp1 = obj1.start;
		Node temp2 = obj2.start;
		for ( int i = 0 ; i < obj1.count ; i++) {
			if ( i == index) {
				if(temp1.getNext() == null) {
					concat(obj1,obj2);
				}
				else {
					Node dummy = temp1.getNext();
					temp1.setNext(obj2.start);
					temp2.setPrevious(temp1.getNext());
					dummy.setPrevious(obj2.end);
					obj2.end.setNext(dummy);
					end = obj1.end;
					obj1.count = obj1.count + obj2.count;
				}
			}
			temp1 = temp1.getNext();
		}
	}
	public void print () {
		Node temp = start;
		while(temp != null) {
			System.out.print(temp.getData()  + " ");
			temp = temp.getNext();
		}
		System.out.println(" ");
	}	
}