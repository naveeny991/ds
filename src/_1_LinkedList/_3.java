package _1_LinkedList;

public class _3 {

	public Node reverseList(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}
}
