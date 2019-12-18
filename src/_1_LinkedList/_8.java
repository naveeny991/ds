package _1_LinkedList;

public class _8 {

	public Node getIntersectNode(Node head1, Node head2) {

		int size1 = getCount(head1);
		int size2 = getCount(head2);

		if (size1 > size2) {
			return getNode(head1, head2, size1 - size2);
		} else {
			return getNode(head2, head1, size2 - size1);
		}
	}

	private Node getNode(Node head1, Node head2, int diff) {

		while (head1 != null && diff-- > 0) {
			head1 = head1.next;
		}

		while (head1 != null && head2 != null && head1 != head2) {
			head1 = head1.next;
			head2 = head2.next;
		}

		if (head1 == null || head2 == null) {
			return null;
		}

		return head1;
	}

	private int getCount(Node head) {
		if (head == null)
			return 0;
		return 1 + getCount(head.next);
	}
}
