package _1_LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _15 {

	public static Node mergeKSortedLists(Node arr[], int k) {
		Node head = null, last = null;

		PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
			@Override
			public int compare(Node a, Node b) {
				return a.data - b.data;
			}
		});

		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		
		while (!pq.isEmpty()) {
			Node top = pq.remove();
			if (top.next != null) {
				pq.add(top.next);
			}
			if (head == null) {
				head = top;
				last = top;
			} else {
				last.next = top;
				last = top;
			}
		}
		
		return head;
	}
}
