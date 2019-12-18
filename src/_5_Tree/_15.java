package _5_Tree;

import java.util.Map;
import java.util.TreeMap;

public class _15 {

	void printLeftView(Node root, int level, Level max) {
		if (root == null) {
			return;
		}
		if (level > max.level) {
			System.out.print(root.data + " ");
			max.level = level;
		}
		printLeftView(root.left, level + 1, max);
		printLeftView(root.right, level + 1, max);
	}

	void printRightView(Node root, int level, Level max) {
		if (root == null) {
			return;
		}
		if (level > max.level) {
			System.out.print(root.data + " ");
			max.level = level;
		}
		printRightView(root.right, level + 1, max);
		printRightView(root.left, level + 1, max);
	}

	void printTopView(Node root) {
		if (root == null) {
			return;
		}
		Map<Integer, Integer> map = new TreeMap<>();
		printTopViewUtil(root, 0, map);
		for (int x : map.values()) {
			System.out.print(x + " ");
		}
	}

	private void printTopViewUtil(Node root, int hd, Map<Integer, Integer> map) {
		if (root == null)
			return;

		if (!map.containsKey(hd)) {
			map.put(hd, root.data);
		}

		printTopViewUtil(root.left, hd - 1, map);
		printTopViewUtil(root.right, hd + 1, map);
	}

	void printBottomView(Node root) {
		if (root == null)
			return;

		Map<Integer, Integer> map = new TreeMap<>();
		printBottomViewUtil(root, 0, map);
		for (int x : map.values()) {
			System.out.print(x + " ");
		}
	}

	private void printBottomViewUtil(Node root, int hd, Map<Integer, Integer> map) {
		if (root == null)
			return;
		map.put(hd, root.data);
		printBottomViewUtil(root.left, hd - 1, map);
		printBottomViewUtil(root.right, hd + 1, map);
	}

	class Level {
		int level;
	}

}
