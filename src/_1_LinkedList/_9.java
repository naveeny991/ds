package _1_LinkedList;

public class _9 {

	public Node rotateListByK(Node head, int k) {

		if (head == null || k == 0)
			return null;

		Node curr = head;
		while (curr != null && k-- > 0) {
			curr = curr.next;
		}

		if (curr == null)
			return null;

		Node kthNode = curr;

		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = head;

		head = kthNode.next;
		kthNode.next = null;

		return head;
	}
}
