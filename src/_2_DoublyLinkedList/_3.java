package _2_DoublyLinkedList;

public class _3 {

	public void swapKth(Node head, int k) {
		int n = countNodes();

		if (n < k)
			return;

		if (2 * k - 1 == n)
			return;

		Node x = head;
		Node x_prev = null;
		for (int i = 1; i < k; i++) {
			x_prev = x;
			x = x.next;
		}

		Node y = head;
		Node y_prev = null;
		for (int i = 1; i < n - k + 1; i++) {
			y_prev = y;
			y = y.next;
		}

		if (x_prev != null)
			x_prev.next = y;

		if (y_prev != null)
			y_prev.next = x;

		Node temp = x.next;
		x.next = y.next;
		y.next = temp;

		if (k == 1)
			head = y;

		if (k == n)
			head = x;
	}

	private int countNodes() {
		// TODO Auto-generated method stub
		return 0;
	}
}
