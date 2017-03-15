@SuppressWarnings("unchecked")
public class Unbounded<T> {
	private T [] initialArray ;
	private int count ;
	private int size;
	private int alpha;
	private int beta;
	Unbounded ( int size) {
		alpha = 4;
		beta = 2;
		this.size = size;
		initialArray = (T[])new Object[size];
		count = 0;
	}

	public void reallocate(int newsize) {
		T[] temp = (T[]) new Object[newsize];
		for ( int i = 0 ; i < count ; i++ ) {
			temp  [i] = initialArray[i];
		}
		initialArray = temp ;
		size = newsize;
	}

	public void pushBack(T value) {
		// System.out.println(count);
		if(count == size) {
			reallocate(beta*count);
			// System.out.println("hello");
		}
		initialArray[count] = value;
		count++;
	}
	public void popBack() {
		if(count > 0)count--;
		if(((alpha*count) <= size) && (count>0))reallocate(beta*count);
	}
	public void sizeOf() {
		System.out.println(count);
	}
	public void capacityOf() {
		System.out.println(size);
	}
	public void print() {
		for( int i = 0; i < count; i++) {
			if(i == count-1 ) {
				System.out.println(initialArray[i]);
			}
			else
				System.out.print(initialArray[i] + " ");
		}
	}

}