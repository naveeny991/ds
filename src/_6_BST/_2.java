package _6_BST;

public class _2 {

	public Node sortedArrayToBST(int[] num) {
		if (num.length == 0)
			return null;

		return sortedArrayToBST(num, 0, num.length - 1);
	}

	public Node sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
			return null;

		int mid = (start + end) / 2;
		Node root = new Node(num[mid]);
		
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);

		return root;
	}
}

class Node {
	int data;
	Node left;
	Node right;

	Node(int d) {
		data = d;
	}
}
