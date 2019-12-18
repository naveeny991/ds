package _8_Graph;

import java.util.HashSet;
import java.util.Set;

public class _2 {

	public void DFS(Node[] nodes) {
		Set<Node> visited = new HashSet<>();
		for (Node node : nodes) {
			if (!visited.contains(node)) {
				DFSUtil(node, visited);
			}
		}
	}

	public void DFS(Node a) {
		Set<Node> visited = new HashSet<>();
		DFSUtil(a, visited);
	}

	private void DFSUtil(Node a, Set<Node> visited) {
		visited.add(a);
		System.out.println(a.data);
		for (Node node : a.children) {
			if (!visited.contains(node)) {
				DFSUtil(a, visited);
			}
		}
	}
}
