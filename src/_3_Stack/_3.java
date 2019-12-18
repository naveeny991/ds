package _3_Stack;

import java.util.Stack;

public class _3 {

	static int findCelebrity(int n) {
		Stack<Integer> st = new Stack<>();
		int c;

		for (int i = 0; i < n; i++) {
			st.push(i);
		}

		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();

			if (knows(a, b)) {
				st.push(b);
			} else {
				st.push(a);
			}
		}

		c = st.pop();

		for (int i = 0; i < n; i++) {
			if (i != c && (knows(c, i) || !knows(i, c)))
				return -1;
		}
		return c;
	}

	private static boolean knows(int c, int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
