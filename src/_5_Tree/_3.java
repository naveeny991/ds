package _5_Tree;

public class _3 {
	void printBoundary(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		printBoundaryLeft(node.left);
		printLeaves(node.left);
		printLeaves(node.right);
		printBoundaryRight(node.right);
	}

	void printBoundaryLeft(Node node) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		} else if (node.right != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}
	}

	void printLeaves(Node node) {
		if (node == null) {
			return;
		}
		printLeaves(node.left);
		if (node.left == null && node.right == null)
			System.out.print(node.data + " ");
		printLeaves(node.right);

	}

	void printBoundaryRight(Node node) {
		if (node == null) {
			return;
		}
		if (node.right != null) {
			printBoundaryRight(node.right);
			System.out.print(node.data + " ");
		} else if (node.left != null) {
			printBoundaryRight(node.left);
			System.out.print(node.data + " ");
		}
	}
}
