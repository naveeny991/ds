package _8_Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class _1 {

	public void BFS(Node a) {
		Set<Node> visited = new HashSet<>();
		Queue<Node> q = new LinkedList<>();
		q.add(a);
		visited.add(a);
		while (!q.isEmpty()) {
			Node node = q.poll();
			System.out.println(node.data);
			for (Node n : node.children) {
				if (!visited.contains(n)) {
					q.add(n);
					visited.add(n);
				}
			}
		}
	}

}

class Graph{
	Node[] nodes;
}

class Node {
	public int data;
	public List<Node> children;

	public Node(int data) {
		this.data = data;
	}

	public void addChild(Node n) {
		if (this.children == null) {
			this.children = new LinkedList<Node>();
		}
		this.children.add(n);
	}
}
