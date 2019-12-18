package _3_Stack;

import java.util.Stack;

public class _7 {

	Stack<Integer> s;
	Integer minEle;

	_7() {
		s = new Stack<Integer>();
	}

	int getMin() {
		if (s.isEmpty()) {
			return -1;
		} else
			return minEle;
	}

	int peek() {
		if (s.isEmpty()) {
			return -1;
		}

		int t = s.peek();

		if (t < minEle)
			return minEle;
		else
			return t;
	}

	int pop() {
		if (s.isEmpty()) {
			return -1;
		}

		int t = s.pop();

		if (t < minEle) {
			minEle = 2 * minEle - t;
			return minEle;
		} else {
			return t;
		}

	}

	void push(Integer x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			return;
		}

		if (x < minEle) {
			s.push(2 * x - minEle);
			minEle = x;
		} else {
			s.push(x);
		}
	}
};
