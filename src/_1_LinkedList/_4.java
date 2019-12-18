package _1_LinkedList;

public class _4 {

	public void printReverse(Node head) {
		
		if(head == null) return;
		
		printReverse(head.next);
		
		System.out.println(head.data);
		
	}
}
