package _2_DoublyLinkedList;

public class _1 {

	public Node push(Node head, int newData) {
		Node newNode = new Node(newData);

		if (head == null) {
			head = newNode;
			return head;
		}

		newNode.next = head;
		head.previous = newNode;
		head = newNode;

		return head;
	}

	public Node append(Node head, int newData) {
		Node newNode = new Node(newData);

		if (head == null) {
			head = newNode;
			return head;
		}

		Node last = head;

		while (last.next != null) {
			last = last.next;
		}

		last.next = newNode;
		newNode.previous = last;

		return head;
	}

	public Node insert(Node head, int pos, int newData) {

		return head;
	}

	public Node delete(Node head, Node node) {

		if (head == null || node == null)
			return head;

		if (head == node) {
			return head.next;
		}

		Node prev = node.previous;
		prev.next = node.next;

		if (node.next != null) {
			node.next.previous = prev;
		}

		return head;
	}
}

class Node {
	int data;
	Node previous;
	Node next;

	Node(int d) {
		data = d;
	}
}
