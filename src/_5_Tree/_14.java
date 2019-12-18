package _5_Tree;

public class _14 {

	void find(Node root, int level, MaxLevel max) {

		if (root == null) {
			return;
		}

		find(root.left, level + 1, max);

		if (level > max.level) {
			max.node = root;
			max.level = level;
		}

		find(root.right, level + 1, max);
	}

	int deepestNode(Node root) {
		MaxLevel max = new MaxLevel();
		find(root, 0, max);
		return max.node.data;
	}
}

class MaxLevel {
	int level;
	Node node;
}
