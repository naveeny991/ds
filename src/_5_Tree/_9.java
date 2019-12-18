package _5_Tree;

import java.util.ArrayList;

public class _9 {

	void printPaths(Node node) {
		printPathsRecur(node, new ArrayList<Node>(), 0);
	}

	void printPathsRecur(Node node, ArrayList<Node> arrayList, int pathLen) {
		if (node == null)
			return;

		arrayList.add(node);

		if (node.left == null && node.right == null) {
			System.out.print(arrayList);
		} else {
			printPathsRecur(node.left, arrayList, pathLen);
			printPathsRecur(node.right, arrayList, pathLen);
		}

		arrayList.remove(node);
	}
}
