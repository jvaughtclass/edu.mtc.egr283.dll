package edu.mtc.egr283.dll;

public class DLLNodeDriver {

	public static void main(String[] args) {

		DLLNode<String> node1 = new DLLNode<String>();
		node1.setNodeData("First");

		System.out.println(node1.getNodeData());
		System.out.println();

		DLLNode<String> node3 = new DLLNode<String>("Third");
		System.out.println(node3.getNodeData());
		System.out.println();

		DLLNode<String> node2 = new DLLNode<String>(node1, "Second", node3);
		node1.setNext(node2);
		node3.setPrevious(node2);
		System.out.println(node2.getPrevious().getNodeData());
		System.out.println(node2.getNodeData());
		System.out.println(node2.getNext().getNodeData());
		System.out.println();

		DLLNode<String> nextCursor = new DLLNode<String>(null, "Cursor", node1);
		while(nextCursor.getNext() != null) {
			nextCursor = nextCursor.getNext();
			System.out.println(nextCursor.getNodeData());
		}// Ending bracket of while loop
		System.out.println();

		DLLNode<String> previousCursor = new DLLNode<String>(node3, "Cursor", null);
		while(previousCursor.getPrevious() != null) {
			previousCursor = previousCursor.getPrevious();
			System.out.println(previousCursor.getNodeData());
		}// Ending bracket of while loop
		
	}// Ending bracket of method main
	
}//Ending bracket of DLLNodeDriver