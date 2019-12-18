package _2_DoublyLinkedList;

public class _4 {

	public void rotate(Node head, int N) {
		if (N == 0)
			return;

		Node current = head;

		int count = 1;
		while (count < N && current != null) {
			current = current.next;
			count++;
		}

		if (current == null)
			return;

		Node NthNode = current;

		while (current.next != null)
			current = current.next;

		current.next = head;

		head.previous = current;

		head = NthNode.next;

		head.previous = null;

		NthNode.next = null;
	}
}
