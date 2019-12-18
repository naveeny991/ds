package _8_Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class _7 {
	public void topologicalSort(Graph graph) {
		Set<Node> visited = new HashSet<>();
		Stack<Node> stack = new Stack<>();
		Node[] nodes = graph.nodes;

		for (Node node : nodes) {
			if (!visited.contains(node)) {
				topoUtil(node, visited, stack);
			}
		}
	}

	private void topoUtil(Node node, Set<Node> visited, Stack<Node> stack) {
		visited.add(node);
		for (Node n : node.children) {
			if (!visited.contains(n)) {
				topoUtil(n, visited, stack);
			}
		}
		stack.push(node);
	}
}
