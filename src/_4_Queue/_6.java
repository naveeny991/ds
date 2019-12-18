package _4_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _6 {
	void printLevelOrder(TNode root) {
		Queue<TNode> queue = new LinkedList<>();
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
}

class TNode {
	public int data;
	public TNode left, right;

	public TNode(int item) {
		data = item;
	}

	@Override
	public String toString() {
		return "" + data;
	}
}
