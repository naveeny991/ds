package _2_DoublyLinkedList;

public class _5 {

	Node mergeSort(Node head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node mid = getMid(head);
		Node midNext = mid.next;
		midNext.previous = null;
		head = mergeSort(head);
		midNext = mergeSort(midNext);

		return merge(head, mid);
	}

	Node getMid(Node head) {
		Node fast = head, slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	Node merge(Node first, Node second) {
		if (first == null) {
			return second;
		}

		if (second == null) {
			return first;
		}

		if (first.data < second.data) {
			first.next = merge(first.next, second);
			first.next.previous = first;
			first.previous = null;
			return first;
		} else {
			second.next = merge(first, second.next);
			second.next.previous = second;
			second.previous = null;
			return second;
		}
	}
}
