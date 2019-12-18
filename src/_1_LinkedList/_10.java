package _1_LinkedList;

public class _10 {

	public Node mergeSort(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node mid = getMid(head);
		Node midNext = mid.next;
		mid.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(midNext);

		return merge(left, right);
	}

	private Node merge(Node a, Node b) {
		if (a == null)
			return b;

		if (b == null)
			return a;

		Node res = null;

		if (a.data < b.data) {
			res = a;
			res.next = merge(a.next, b);
		} else {
			res = b;
			res.next = merge(a, b.next);
		}

		return res;
	}

	private Node getMid(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}
