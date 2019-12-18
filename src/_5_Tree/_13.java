package _5_Tree;

public class _13 {

	int height(Node root, Diameter a) {
		if (root == null)
			return 0;

		int left_height = height(root.left, a);

		int right_height = height(root.right, a);

		a.dia = Math.max(a.dia, 1 + left_height + right_height);

		return 1 + Math.max(left_height, right_height);
	}

	int diameter(Node root) {
		if (root == null) {
			return 0;
		}

		Diameter a = new Diameter();
		return a.dia;
	}

	class Diameter {
		int dia = Integer.MIN_VALUE;
	}

}
