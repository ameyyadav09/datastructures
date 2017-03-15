public class LinkedMethods<T> implements Linkers<T> {
	 private Node start;
	 private Node end;
	 private int count;
	 LinkedMethods() {
	 	start = null;
	 	end = null;
	 	count = 0;
	 }
	 public void insert(T data) {
	 	Node<T> obj = new Node<T>(data);
	 	if(count == 0) {
		 	start = obj;
		 	end = start;
	 }
	 else {
	 	end.setLink(obj);
	 	end = obj;
	 }
	 count++;
	 }
	 public void insertAfter (T data , T data1) {
	 	Node temp1 = start;
	 	for (int i = 0; i < count ; i++) {
	 		if(temp1.getData().equals(data)) {
	 			Node temp2 = temp1.getLink();
	 			Node<T> newo = new Node<T>(data1);
	 			if(temp1.getLink().equals(null)) {
	 				end.setLink(newo);
	 				end = newo;
	 			}
	 			else {
		 			temp1.setLink(newo);
		 			newo.setLink(temp2);
	 			}
	 		}
	 		temp1 = temp1.getLink();
	 	}
	 	count++;
	}
	public void insertBefore (T data , T data1) {
		Node<T> newo = new Node<T>(data1);
		Node temp1 = start;
		Node temp2 = temp1;
		for (int i = 0; i < count ; i++) {
			if(temp1.getData() == data) {
				if(i == 0) {
					newo.setLink(temp1);
					start = newo;break;
				}
				else {
					newo.setLink(temp1);
					temp2.setLink(newo);break;
				}
			}
			temp2 = temp1;
			temp1 = temp1.getLink();
		}
		count++;
	}
	public void removeAt(int n) {
		Node temp1 = start;
		Node temp2 = temp1;
		for( int index = 0; index < count ; index++) {
			if(index == n) {
				if(temp1.getLink() == null) {
					temp2.setLink(null);
					end = temp2;
				}
				else if(index == 0) {
					start = temp1.getLink();
				}
				else {
					temp2.setLink(temp1.getLink());
				}
			}
			temp2 = temp1;
			temp1 = temp1.getLink();
		}
		count--;
	}
	public void removeElement(T value) {
		Node temp1 = start;
		Node temp2 = start;
		for (int index = 0 ; index < count ; index++) {
			if(temp1.getData() == value) {
				if(temp1.getLink() == null) {
					temp2.setLink(null);
					end = temp2;
				}
				else if(index == 0) {
					start = temp2.getLink();
				}
				else {
					temp2.setLink(temp1.getLink());
				}
			}
			temp2 = temp1;
			temp1 = temp1.getLink();
		}
		count--;
	}
	public void popFront() {
		removeAt(0);
	}
	public void popBack() {
		removeAt(count-1);
	}
	public void pushFront(T value) {
		Node<T> newo = new Node<T>(value);
		Node temp = start;
		newo.setLink(temp);
		start = newo;
	}
	public void pushBack(T value) {
		insert(value);
	}
	public void concat(LinkedMethods<T> temp1 , LinkedMethods<T> temp2) {
		start = temp1.start;
		temp1.end.setLink(temp2.start);
		end = temp2.end;
		count = temp1.count + temp2.count;
	}
	public void concatAt(LinkedMethods<T> obj1 , LinkedMethods<T> obj2, int index) {
		Node temp1 = obj1.start;
		Node temp2 = obj2.start;
		boolean flag = false;
			for (int i = 0 ; i < obj1.count ; i++) {
				if (i == index) {
					obj2.end.setLink(temp1.getLink());
				temp1.setLink(obj2.start);
				}
				else if(i == count-1) {
					obj1.end.setLink(obj2.start);
					end = obj2.end;
				}
				else
					temp1 = temp1.getLink();				
			}
			start = obj1.start;
			end = obj2.end;
			count = obj1.count + obj2.count;
	}
	public void reverseIt() {
		start = reverseIt(start);
	}
	public Node reverseIt(Node head) {
		if (head == null || head.getLink() == null) {
			return head;
		}
		Node prev = null;
		Node cur = head;
		Node next = null;
		while (cur != null) {
			next = cur.getLink();
			cur.setLink(prev);
			prev = cur;
			cur = next;
		}
		head = prev;
		return head;
	}
	private void reverserecur(Node head) {
		if (head == null || head.getLink() == null) {
			return head;
		}

		Node sec = head.getLink();
		head.setLink(null);

		Node next = reverserecur(sec);

		sec.setLink(head);
		
		return next;
	}
	 public void print () {
	 	Node temp = start;
	 	while(temp != null) {
	 		System.out.print(temp.getData()  + " ");
	 		temp = temp.getLink();
	 	}
	 	System.out.println(" ");
	 }
}	