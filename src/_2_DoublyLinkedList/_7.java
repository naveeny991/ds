package _2_DoublyLinkedList;

public class _7 {

	TNode head;
	TNode prev;

	public TNode extractLeafList(TNode root) {
		if (root == null)
			return null;
		if (root.left == null && root.right == null) {
			if (head == null) {
				head = root;
				prev = root;
			} else {
				prev.right = root;
				root.left = prev;
				prev = root;
			}
			return null;
		}
		root.left = extractLeafList(root.left);
		root.right = extractLeafList(root.right);
		return root;
	}
}
