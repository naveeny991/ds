package _6_BST;

import java.util.Stack;

public class _7 {

	public int kthSmallest(Node root, int k) {
		if (root == null) {
			return -1;
		}

		Stack<Node> stack = new Stack<Node>();

		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (--k == 0) {
				return root.data;
			}
			root = root.right;
		}

		return -1;
	}
}
