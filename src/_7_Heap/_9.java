package _7_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _9 {
	
	public static void getMedian(int[] arr) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			minHeap.offer(arr[i]);
			maxHeap.offer(minHeap.poll());
			if (minHeap.size() < maxHeap.size()) {
				minHeap.offer(maxHeap.poll());
			}
			if (minHeap.size() > maxHeap.size()) {
				System.out.println(minHeap.peek());
			} else {
				System.out.println((minHeap.peek() + maxHeap.peek()) / 2.0);
			}
		}
	}
}
