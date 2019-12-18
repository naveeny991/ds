package _3_Stack;

import java.util.Stack;

public class _6 {

	void deleteMid(Stack<Character> st, int n, int curr) {

		if (st.empty() || curr == n) {
			return;
		}
		char x = st.pop();

		deleteMid(st, n, curr + 1);

		if (curr != n / 2) {
			st.push(x);
		}
	}

}
