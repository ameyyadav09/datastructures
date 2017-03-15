interface DoublyInterface<T> {
public void insert (T value);
public void insertAfter(T ref , T value);
public void insertBefore(T ref , T value);
public void pushFront(T value);
public void pushBack(T value);
public void removeElement(T value);
public void removeIndex(int index);
public void popFront();
public void popBack();
public void concat(DoublyLinkedMethods<T> temp1 , DoublyLinkedMethods<T> temp2);
public void concatAt(DoublyLinkedMethods<T> obj1, DoublyLinkedMethods<T> obj2 , int index);
}