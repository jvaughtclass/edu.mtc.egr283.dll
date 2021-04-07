package edu.mtc.egr283.dll;


public class DLL<T> {

	private DLLNode<T> head;
	private DLLNode<T> tail;
	private int length;

	public DLL() {
		this.length = 0;
		this.head = new DLLNode<T>();
		this.tail = new DLLNode<T>();
		this.head.setNext(tail);
		this.tail.setPrevious(head);
	}// Ending bracket of constructor

	public boolean isEmpty() {
		if(this.length!=0) {
			return false;
		}else {
			return true;
		}
	}// Ending bracket of constructor
	
	public int size() {
		return this.length;
	}// Ending bracket of constructor

	public T getDataAtPosition(int position) {
		return (this.find(position)).getNodeData();
	}// Ending bracket of method getNodeDataAt

	public void addAtHead(T newNodeData) {
		this.addAfter(this.head, new DLLNode<T>(null, newNodeData, null));
	}// Ending bracket of method addAtHead

	public void addAtTail(T newNodeData) {
		this.addAfter(this.tail.getPrevious(), new DLLNode<T>(null, newNodeData, null));
	}// Ending bracket of method addAtTail

	public void add(T newNodeData, int position) {
		DLLNode<T> cursor = this.head;
		DLLNode<T> newNode = new DLLNode<T>(null, newNodeData, null);

		if(position>this.size()) {
			position=this.size();
		}
		if(position > 0) {
			cursor = this.find(position - 1);
		}// Ending bracket of if

		this.addAfter(cursor, newNode);
	}// Ending bracket of method add

	public T remove(int position) {
		DLLNode<T> cursor = this.head;
		if(position > 0) {
			cursor = this.find(position - 1);
		}// Ending bracket of if

		DLLNode<T> target = cursor.getNext();
		(target.getPrevious()).setNext(target.getNext());
		(target.getNext()).setPrevious(target.getPrevious());
		--this.length;

		T rv = target.getNodeData();

		target.setNext(null);
		target.setNodeData(null);
		target.setPrevious(null);
		return rv;

	}// Ending bracket of method remove

	public T removeData(T target) {
		return this.remove(this.findIndex(target));
	}// Ending bracket of method removeData

	public void setData(T newNodeData, int position) {
		(this.find(position)).setNodeData(newNodeData);
	}// Ending bracket of method setData
	

	public String toString() {
		StringBuffer sb = new StringBuffer();
		DLLNode<T> cursor = this.head.getNext();

		while(cursor != tail) {
			sb.append(cursor.getNodeData().toString() + " ");
			cursor = cursor.getNext();
		}//end of while loop

		return sb.toString();
	}//ending bracket of method toString
	

	private void addAfter(DLLNode<T> cursor, DLLNode<T> newNode) {
		newNode.setNext(cursor.getNext());
		cursor.setNext(newNode);
		newNode.setPrevious(cursor);
		(newNode.getNext()).setPrevious(newNode);
		++this.length;
	}// Ending bracket of method addAfter

	private DLLNode<T> findData(T target) {
		DLLNode<T> cursor = this.head.getNext();

		while((cursor != tail) && (!(cursor.getNodeData().equals(target)))) {
			cursor = cursor.getNext();
		}// Ending bracket of while loop

		return cursor;
	}// Ending bracket of method findData

	private int findIndex(T target) {
		int index = 0;

		DLLNode<T> cursor = this.head.getNext();

		while((cursor != tail) && (!(cursor.getNodeData().equals(target)))) {
			cursor = cursor.getNext();
			++index;
		}// Ending bracket of while loop

		if(!(cursor.getNodeData().equals(target))) {
			index = -1;
		}// Ending bracket of if

		return index;
	}// Ending bracket of method findIndex

	private DLLNode<T> find(int position) {
		DLLNode<T> cursor = null;
		if(position < (this.size()/2)) {
			cursor = this.head.getNext();
			for(int i = 0; i != position; ++i) {
				cursor = cursor.getNext();
			}// Ending bracket of for loop
		} else {
			cursor = this.tail.getPrevious();
			for(int i = this.size() - 1; i != position; --i) {
				cursor = cursor.getPrevious();
			}// Ending bracket of for loop
		}// Ending bracket of if

		return cursor;
	}// Ending bracket of method find

}// Ending bracket of class DLL


