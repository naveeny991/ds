package _3_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class _1 {

}

class Stack1 {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	int size;

	void push(int x) {
		size++;
		q2.offer(x);
		while (!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	void pop() {
		if (q1.isEmpty())
			return;
		q1.poll();
		size--;
	}

	int top() {
		if (q1.isEmpty())
			return -1;
		return q1.peek();
	}

	int size() {
		return size;
	}
}

class stack2 {
	Queue<Integer> q = new LinkedList<Integer>();

	void push(int val) {
		int size = q.size();

		q.add(val);

		for (int i = 0; i < size; i++) {
			int x = q.remove();
			q.add(x);
		}
	}

	int pop() {
		if (q.isEmpty()) {
			return -1;
		}
		int x = q.remove();
		return x;
	}

	int top() {
		if (q.isEmpty())
			return -1;
		return q.peek();
	}

	boolean isEmpty()  
    { 
        return q.isEmpty(); 
    }
}
