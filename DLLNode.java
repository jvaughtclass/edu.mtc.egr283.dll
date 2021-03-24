package edu.mtc.egr283.dll;

public class DLLNode<T> {
	
	private DLLNode<T> previous;
	private T nodeData;
	private DLLNode<T> next;
	
	public DLLNode() {
		this(null);
	}// Ending bracket of constructor
	
	public DLLNode(T nodeData) {
		this(null, nodeData, null);
	}// Ending bracket of constructor
	
	public DLLNode(DLLNode<T> newPrevious, T newNodeData, DLLNode<T> newNext) {
		this.setPrevious(newPrevious);
		this.setNodeData(newNodeData);
		this.setNext(newNext);
	}// Ending bracket of constructor

	public DLLNode<T> getPrevious() {
		return this.previous;
	}// Ending bracket of method getPrevious
	
	public void setPrevious(DLLNode<T> newPrevious) {
		this.previous = newPrevious;
	}// Ending bracket of method setPrevious
	
	public T getNodeData() {
		return this.nodeData;
	}// Ending bracket of method getNodeData
	
	public void setNodeData(T newNodeData) {
		this.nodeData = newNodeData;
	}// Ending bracket of method setNodeData
	
	public DLLNode<T> getNext() {
		return this.next;
	}// Ending bracket of method getNext
	
	public void setNext(DLLNode<T> newNext) {
		this.next = newNext;
	}// Ending bracket of method setNext
}// Ending bracket of class DLLNode