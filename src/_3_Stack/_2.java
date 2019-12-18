package _3_Stack;

import java.util.Stack;

public class _2 {

	void printNGE(int arr[], int n) {
		Stack<Integer> s = new Stack<>();
		int element, next;

		s.push(arr[0]);

		for (int i = 1; i < n; i++) {
			next = arr[i];
			if (!s.isEmpty()) {
				element = s.pop();
				while (element < next) {
					System.out.println(element + " --> " + next);
					if (s.isEmpty())
						break;
					element = s.pop();
				}
				if (element > next)
					s.push(element);
			}
			s.push(next);
		}

		while (!s.isEmpty()) {
			element = s.pop();
			next = -1;
			System.out.println(element + " -- " + next);
		}
	}
}
