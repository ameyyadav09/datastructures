interface Linkers<T> {
		public void insert(T data);
		public void insertAfter (T data , T data1);
		public void insertBefore (T data , T data1);
		public void removeAt(int n);
		public void removeElement(T value);
		public void popFront();
		public void popBack();
		public void pushFront(T value);
		public void pushBack(T value)	;
		public void concat(LinkedMethods<T> temp1 , LinkedMethods<T> temp2);
		public void concatAt(LinkedMethods<T> obj1 , LinkedMethods<T> obj2, int index);
}