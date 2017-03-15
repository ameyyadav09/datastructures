public class LinkedQueue implements QueueInterface {
	private Node front;
	private Node rear;
	private int count;
	LinkedQueue() {
		front = null;
		rear = null;
		count = 0;
	}
	public boolean isEmpty() {
		if(front == null){
			return true;
		}
		else
			return false;
	}
	public int getSize() {
		return count;
	}
	public void insert(int value) {
		Node newo = new Node(value);
		if(rear == null) {
			front = newo;
			rear = newo;
		}
		else {
			rear.setLink(newo);
			rear = rear.getLink();
		}
		count++;
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("queue empty");
		}
		else {
			front = front.getLink();
			if(front == null)
				rear = null;
			count--;
		}
	}
	public void print() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			Node temp = front;
			while(temp != rear.getLink()) {
				System.out.println(temp.getData());
				temp = temp.getLink();
			}
			System.out.print("\n");
		}
	}
}