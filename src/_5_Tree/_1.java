package _5_Tree;

import java.util.Stack;

public class _1 {

	void preorder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.empty()) {
			root = stack.pop();
			System.out.print(root.data + " ");
			if (root.right != null) {
				stack.push(root.right);
			}
			if (root.left != null) {
				stack.push(root.left);
			}
		}
	}

	void inorder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			System.out.print(root.data + " ");
			root = root.right;
		}
	}

	void postorder(Node root) {
		Stack<Node> stack = new Stack<>();
		while (true) {
			while (root != null) {
				stack.push(root);
				stack.push(root);
				root = root.left;
			}
			if (stack.empty()) {
				return;
			}
			root = stack.pop();
			if (!stack.empty() && stack.peek() == root) {
				root = root.right;
			} else {
				System.out.print(root.data + " ");
				root = null;
			}
		}
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int d) {
		this.data = d;
	}
}
