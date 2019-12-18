package _8_Graph;

import java.util.HashSet;
import java.util.Set;

public class _6 {

	public boolean isCyclicUndirected(Graph graph) {
		Set<Node> visited = new HashSet<>();
		Node[] nodes = graph.nodes;

		for (Node node : nodes) {
			if (!visited.contains(node)) {
				if (isCyclicUtil1(node, visited, null)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isCyclicUtil1(Node node, Set<Node> visited, Node parent) {
		visited.add(node);
		for (Node n : node.children) {
			if (!visited.contains(n)) {
				if (isCyclicUtil1(n, visited, node)) {
					return true;
				}
			} else {
				if (!n.equals(parent)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isCyclicDirected(Graph graph) {
		Set<Node> visited = new HashSet<>();
		Set<Node> parentStack = new HashSet<>();
		Node[] nodes = graph.nodes;
		for (Node node : nodes) {
			if (!visited.contains(node)) {
				if (isCyclicUtil2(node, visited, parentStack)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isCyclicUtil2(Node node, Set<Node> visited, Set<Node> parentStack) {
		if (parentStack.contains(node)) {
			return true;
		}
		if (visited.contains(node)) {
			return false;
		}
		visited.add(node);
		parentStack.add(node);
		for (Node n : node.children) {
			if (!visited.contains(n)) {
				if (isCyclicUtil2(n, visited, parentStack)) {
					return true;
				}
			}
		}
		parentStack.remove(node);
		return false;
	}

}
