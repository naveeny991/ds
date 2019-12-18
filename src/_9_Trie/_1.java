package _9_Trie;

import java.util.HashMap;
import java.util.Map;

public class _1 {

	public void insert(Trie trie, String key) {
		Trie curr = trie;

		for (int i = 0; i < key.length(); i++) {
			if (curr.children.get(key.charAt(i)) == null)
				curr.children.put(key.charAt(i), new Trie());

			curr = curr.children.get(key.charAt(i));
		}

		curr.isLeaf = true;
	}
	
	public boolean search(Trie trie, String key) {
		Trie curr = trie;

		for (int i = 0; i < key.length(); i++) {
			curr = curr.children.get(key.charAt(i));
			if (curr == null)
				return false;
		}

		return curr.isLeaf;
	}

}

class Trie {

	boolean isLeaf;
	Map<Character, Trie> children;

	Trie() {
		isLeaf = false;
		children = new HashMap<>();
	}
}
