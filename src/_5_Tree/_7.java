package _5_Tree;

public class _7 {

	int isSumTree(Node node) {
		int ls; // for sum of nodes in left subtree
		int rs; // for sum of nodes in right subtree

		if (node == null || isLeaf(node))
			return 1;

		if (isSumTree(node.left) != 0 && isSumTree(node.right) != 0) {
			if (node.left == null)
				ls = 0;
			else if (isLeaf(node.left))
				ls = node.left.data;
			else
				ls = 2 * (node.left.data);

			if (node.right == null)
				rs = 0;
			else if (isLeaf(node.right))
				rs = node.right.data;
			else
				rs = 2 * (node.right.data);

			if ((node.data == rs + ls))
				return 1;
			else
				return 0;
		}
		return 0;

	}

	boolean isLeaf(Node node) {
		if (node == null)
			return false;
		if (node.left == null && node.right == null)
			return true;
		return false;
	}
}
