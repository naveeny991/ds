package _3_Stack;

import java.util.Stack;

public class _4 {

	void reverse(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int x = st.pop();
		reverse(st);
		insert_at_bottom(st, x);
	}

	void insert_at_bottom(Stack<Integer> st, int x) {
		if (st.isEmpty()) {
			st.push(x);
		} else {
			int a = st.pop();
			insert_at_bottom(st, x);
			st.push(a);
		}
	}
}
