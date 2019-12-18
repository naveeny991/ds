package _8_Graph;

import java.util.HashSet;
import java.util.Set;

public class _4 {

	public int countTrees(Node[] nodes) {
		Set<Node> visited = new HashSet<>();
		int res = 0;
		for (Node node : nodes) {
			if (!visited.contains(node)) {
				DFSUtil(node, visited);
				res++;
			}
		}
		return res;
	}

	private void DFSUtil(Node a, Set<Node> visited) {
		visited.add(a);
		for (Node node : a.children) {
			if (!visited.contains(node)) {
				DFSUtil(a, visited);
			}
		}
	}
}
