package _6_BST;

public class _1 {

	static ListNode head;

	public TreeNode sortedListToBST(ListNode h) {
		if (h == null)
			return null;

		head = h;
		int len = getLength(h);
		return sortedListToBST(0, len - 1);
	}

	public int getLength(ListNode head) {
		int len = 0;
		ListNode p = head;
		while (p != null) {
			len++;
			p = p.next;
		}
		return len;
	}

	public TreeNode sortedListToBST(int start, int end) {
		if (start > end)
			return null;

		int mid = (start + end) / 2;

		TreeNode left = sortedListToBST(start, mid - 1);
		
		TreeNode root = new TreeNode(head.val);
		head = head.next;
		
		TreeNode right = sortedListToBST(mid + 1, end);

		root.left = left;
		root.right = right;

		return root;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
