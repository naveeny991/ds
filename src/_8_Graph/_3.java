package _8_Graph;

import java.util.HashSet;
import java.util.Set;

public class _3 {

	int countPathsUtil(Node s, Node d, Set<Node> visited, int pathCount) {
		visited.add(s);
		if (s == d) {
			pathCount++;
		} else {
			for(Node n : s.children) {
				if(!visited.contains(n)) {
					pathCount = countPathsUtil(n, d, visited, pathCount);
				}
			}
		}
		visited.remove(s);
		return pathCount;
	}

	int countPaths(Node s, Node d) {
		Set<Node> visited = new HashSet<>();
		int pathCount = 0;
		pathCount = countPathsUtil(s, d, visited, pathCount);
		return pathCount;
	}
}
