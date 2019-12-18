package _5_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class _2 {

	void printLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.data + " ");
			if (root.left != null) {
				queue.add(root.left);
			}
			if (root.right != null) {
				queue.add(root.right);
			}
		}
	}

	void printDiagonal(Node root, int d, HashMap<Integer, List<Integer>> map) {
		if (root == null) {
			return;
		}
		List<Integer> k = map.get(d);
		if (k == null) {
			k = new ArrayList<Integer>();
		}
		k.add(root.data);
		map.put(d, k);
		printDiagonal(root.left, d + 1, map);
		printDiagonal(root.right, d, map);
	}

	void printSpiral(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while (!s1.empty() || !s2.empty()) {
			while (!s1.empty()) {
				Node temp = s1.pop();
				System.out.print(temp.data + " ");
				if (temp.right != null) {
					s2.push(temp.right);
				}
				if (temp.left != null) {
					s2.push(temp.left);
				}
			}
			while (!s2.empty()) {
				Node temp = s2.pop();
				System.out.print(temp.data + " ");
				if (temp.left != null)
					s1.push(temp.left);
				if (temp.right != null)
					s1.push(temp.right);
			}
		}
	}
}
