package _4_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class _7 {

	void printMax(int arr[], int n, int k) {
		Deque<Integer> Qi = new LinkedList<Integer>();
		int i;
		for (i = 0; i < k; ++i) {
			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
				Qi.removeLast();
			}
			Qi.addLast(i);
		}
		for (; i < n; ++i) {
			System.out.print(arr[Qi.peek()] + " ");

			while ((!Qi.isEmpty()) && Qi.peek() <= i - k) {
				Qi.removeFirst();
			}
			while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) {
				Qi.removeLast();
			}
			Qi.addLast(i);
		}
		System.out.print(arr[Qi.peek()]);
	}
}
