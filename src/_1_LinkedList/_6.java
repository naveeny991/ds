package _1_LinkedList;

public class _6 {

	public Node removeDuplicates(Node head) {
		Node curr = head;
		while (curr != null) {
			Node temp = curr.next;
			while (temp != null && curr.data == temp.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
		return head;
	}
}
