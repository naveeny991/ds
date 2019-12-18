package _5_Tree;

public class _11 {

	public Node LCA(Node root, int n1, int n2) {
		if (root == null)
			return root;
		if (root.data == n1 || root.data == n2)
			return root;

		Node left = LCA(root.left, n1, n2);
		Node right = LCA(root.right, n1, n2);

		if (left != null && right != null)
			return root;
		if (left != null)
			return LCA(root.left, n1, n2);
		else
			return LCA(root.right, n1, n2);
	}

	public int findLevel(Node root, int a, int level) {
		if (root == null)
			return -1;
		
		if (root.data == a)
			return level;
		
		int left = findLevel(root.left, a, level + 1);
		if (left == -1)
			return findLevel(root.right, a, level + 1);
		
		return left;
	}

	public int findDistance(Node root, int a, int b) {
		Node lca = LCA(root, a, b);

		int d1 = findLevel(lca, a, 0);
		int d2 = findLevel(lca, b, 0);

		return d1 + d2;
	}
}
