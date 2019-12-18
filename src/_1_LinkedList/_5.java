package _1_LinkedList;

public class _5 {

	public Node reverseKNodes(Node head, int k) {

		if (head == null || head.next == null) {
			return head;
		}

		Node curr = head;
		Node prev = null;
		Node next = null;
		while (curr != null && k-- > 0) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		if (next != null) {
			head.next = reverseKNodes(next, k);
		}

		return prev;
	}
}
