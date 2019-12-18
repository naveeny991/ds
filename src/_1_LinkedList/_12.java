package _1_LinkedList;

public class _12 {

	public static Node addLists(Node a, Node b) {
		if (a == null)
			return b;

		if (b == null)
			return a;

		return add(a, b, 0);
	}

	private static Node add(Node a, Node b, int i) {
		
		if(a == null && b == null) {
			return new Node(0);
		}

		Node node = add(a.next, b.next, i + 1);

		int val = node.data + a.data + b.data;

		int sum = val % 10;
		int carry = val / 10;

		node.data = sum;

		if (i > 0 || carry > 0) {
			Node c = new Node(carry);
			c.next = node;
			return c;
		}

		return node;
	}

	public static void main(String[] args) {

		Node a = new Node(9);
		a.next = new Node(9);
		a.next.next = new Node(9);
		Node b = new Node(0);
		b.next = new Node(0);
		b.next.next = new Node(1);

		Node res = addLists(a, b);
		
		while(res != null) {
			System.out.print(res.data);
			res = res.next;
		}
	}
}
