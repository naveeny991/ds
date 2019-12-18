package _1_LinkedList;

public class _13 {

	public NodeR cloneRandom(NodeR head) {

		if (head == null || head.next == null)
			return head;

		NodeR curr = head;
		while (curr != null) {
			NodeR copy = new NodeR(curr.data);
			copy.next = curr.next;
			curr.next = copy;
			curr = copy.next;
		}

		curr = head;
		while (curr != null) {
			if(curr.random != null) {
				curr.next.random = curr.random.next;
			}
			curr = curr.next.next;
		}
		
		curr = head;
		
		NodeR newHead = curr.next;
		
		while(curr != null && curr.next != null) {
			NodeR t = curr.next;
			curr.next = t.next;
			if(t.next != null) {
				t.next = t.next.next;
			}
			curr = curr.next;
		}
		
		return newHead;
	}

}

class NodeR {
	int data;
	NodeR next;
	NodeR random;

	public NodeR(int d) {
		data = d;
	}
}
