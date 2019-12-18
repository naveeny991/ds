package _7_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _5 {

	public Node mergeKSortedLists(Node arr[], int k) {
		Node head = null, last = null;

		PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
			public int compare(Node a, Node b) {
				return a.data - b.data;
			}
		});

		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}

		while (!pq.isEmpty()) {
			Node top = pq.poll();
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

	class Node {
		int data;
		Node next;
	}
}
