package _7_Heap;

import java.util.LinkedList;
import java.util.Queue;

public class _6 {

	public static void convertBST2Heap(Node root) {
		Queue<Integer> keys = new LinkedList<>();

		inorder(root, keys);

		preorder(root, keys);
	}

	public static void inorder(Node root, Queue<Integer> keys) {
		if (root == null) {
			return;
		}
		inorder(root.left, keys);
		keys.add(root.data);
		inorder(root.right, keys);
	}

	public static void preorder(Node root, Queue<Integer> keys) {
		if (root == null) {
			return;
		}
		root.data = keys.poll();
		preorder(root.left, keys);
		preorder(root.right, keys);
	}

	class Node {
		int data;
		Node left;
		Node right;
	}
}
