package edu.mtc.egr283.dll;
public class DLLDriver {
	public static void main(String[] args) {
		DLL<String> dll = new DLL<String>();
		dll.addAtHead("First");
		dll.addAtTail("Last");
		dll.add("Second", 1);
		dll.add("Third", 2);
		dll.add("Fourth", 3);
		dll.add("Fifth", 4);
		dll.add("Sixth", 5);
		for(int i = 0; i < dll.size(); ++i) {
			System.out.println(dll.getDataAtPosition(i).toString());
		}// Ending bracket of for loop

		System.out.println("--------");
		dll.remove(3);
		dll.removeData("Second");

		for(int i = 0; i < dll.size(); ++i) {
			System.out.println(dll.getDataAtPosition(i).toString());
		}// Ending bracket of for loop
	}// Ending bracket of method main
}// Ending bracket of class DLLDriver