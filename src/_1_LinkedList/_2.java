package _1_LinkedList;

public class _2 {

	public Node removeLoop(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		Node a = head;
		Node b = head.next;
		
		while(a != null && b != null && b.next != null && a != b) {
			a = a.next;
			b = b.next.next;
		}
		
		if(a == b) {
			a = head;
			while(a.next != b.next) {
				a = a.next;
				b = b.next;
			}
			b.next = null;
		}
		
		return head;
	}
}


