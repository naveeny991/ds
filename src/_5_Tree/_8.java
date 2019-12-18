package _5_Tree;

public class _8 {

	int toSumTree(Node node) {
		if (node == null)
			return 0;

		int old_val = node.data;

		node.data = toSumTree(node.left) + toSumTree(node.right);

		return node.data + old_val;
	}
}
