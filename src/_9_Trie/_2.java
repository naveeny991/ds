package _9_Trie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class _2 {

	public String findLCP(ArrayList<String> dict) {
		
		Trie head = new Trie();
		for (String s : dict) {
			insert(head, s);
		}

		StringBuilder lcp = new StringBuilder();
		Trie curr = head;

		while (curr != null && !curr.isLeaf && (curr.children.size() == 1)) {
			Iterator<Map.Entry<Character, Trie>> it = curr.children.entrySet().iterator();

			if (it.hasNext()) {
				Map.Entry<Character, Trie> entry = it.next();

				lcp.append(entry.getKey());

				curr = entry.getValue();
			}

		}

		return lcp.toString();
	}

	private static void insert(Trie head, String str) {
		Trie curr = head;

		for (int i = 0; i < str.length(); i++) {
			if (!curr.children.containsKey(str.charAt(i))) {
				curr.children.put(str.charAt(i), new Trie());
			}

			curr = curr.children.get(str.charAt(i));
		}

		curr.isLeaf = true;
	}

}
