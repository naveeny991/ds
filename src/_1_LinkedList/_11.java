package _1_LinkedList;

public class _11 {

	public NodeD flattenList(NodeD head) {

		if (head == null || head.next == null)
			return head;

		head.next = flattenList(head.next);

		head = merge(head, head.next);
		
		return head;
	}

	private NodeD merge(NodeD head, NodeD next) {
		if (head == null)
			return head;

		if(next == null) return head;
		
		NodeD res = null;
		
		if(head.data < next.data) {
			res = head;
			res.next = merge(head.down, next);
		}else {
			res = next;
			res.next = merge(head, next.next);
		}
		
		return res;
	}
}

class NodeD {
	int data;
	NodeD next;
	NodeD down;
}
