package _1_LinkedList;

public class _1 {

	public Node nthFromLast(Node head, int n) {
		Node a = head;
		while (n > 0 && a != null) {
			a = a.next;
			n--;
		}

		if (a == null && n > 0) {
			return null;
		}
		
		Node b = head;
		while (a != null) {
			a = a.next;
			b = b.next;
		}

		return b;
	}
}
