package _2_DoublyLinkedList;

public class _2 {

	public void reverse(Node head) {
		Node temp = null;
		Node current = head;
		while (current != null) {
			temp = current.previous;
			current.previous = current.next;
			current.next = temp;
			current = current.previous;
		}

		if (temp != null) {
			head = temp.previous;
		}
	}

}
