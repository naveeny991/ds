package _5_Tree;

import java.util.Arrays;

public class _5 {

	void printPostOrder(int in[], int pre[], int n) {
		int root = search(in, pre[0], n);
		if (root != 0)
			printPostOrder(in, Arrays.copyOfRange(pre, 1, n), root);

		if (root != n - 1)
			printPostOrder(Arrays.copyOfRange(in, root + 1, n), Arrays.copyOfRange(pre, 1 + root, n), n - root - 1);

		System.out.print(pre[0] + " ");
	}

	int search(int arr[], int x, int n) {
		for (int i = 0; i < n; i++)
			if (arr[i] == x)
				return i;
		return -1;
	}

	static int preIndex = 0;

	void printPost(int[] in, int[] pre, int inStrt, int inEnd) {
		if (inStrt > inEnd)
			return;

		int inIndex = search(in, inStrt, inEnd, pre[preIndex++]);

		printPost(in, pre, inStrt, inIndex - 1);

		printPost(in, pre, inIndex + 1, inEnd);

		System.out.print(in[inIndex] + " ");
	}

	int search(int[] in, int startIn, int endIn, int data) {
		int i = 0;
		for (i = startIn; i < endIn; i++)
			if (in[i] == data)
				return i;
		return i;
	}
}
