package _5_Tree;

public class _6 {

	Node buildTree(int in[], int pre[], int inStrt, int inEnd, Index preIndex) {
		if (inStrt > inEnd)
			return null;

		Node tNode = new Node(pre[preIndex.idx++]);

		if (inStrt == inEnd)
			return tNode;

		int inIndex = search(in, inStrt, inEnd, tNode.data);

		tNode.left = buildTree(in, pre, inStrt, inIndex - 1, preIndex);
		tNode.right = buildTree(in, pre, inIndex + 1, inEnd, preIndex);

		return tNode;
	}

	int search(int arr[], int strt, int end, int value) {
		int i;
		for (i = strt; i <= end; i++) {
			if (arr[i] == value)
				return i;
		}
		return i;
	}
}

class Index {
	int idx;
}