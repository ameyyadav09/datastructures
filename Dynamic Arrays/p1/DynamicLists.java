/*
Implement dynamic list using arrays. 

The dynamic list should have the following operations.

Add element at the end

Remove element at a particular index

Remove a specified element.

Read element at a particular index

Modify element at a particular index

Modify a specified element (all occurrences).
*/
interface DynamicLists<T> {
	public void add(T value);
	public void removeIndex(int index);
	public void removeElement(T value);
	public void read(int index);
	public void modifyIndex(int index , T mvalue);
	public void modifyElement(T value1, T value2);
}