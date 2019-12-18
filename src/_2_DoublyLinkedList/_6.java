package _2_DoublyLinkedList;

public class _6 {

	TNode head;

	void BToDLL(TNode root) {
		if (root == null)
			return;

		BToDLL(root.right);

		root.right = head;

		if (head != null)
			head.left = root;

		head = root;

		BToDLL(root.left);
	}
}

class TNode {
	int data;
	TNode left;
	TNode right;
}
