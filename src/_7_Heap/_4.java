package _7_Heap;

public class _4 {

	static boolean isHeap(int arr[], int i, int n) {
		if (i > (n - 2) / 2) {
			return true;
		}

		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (arr[i] >= arr[left] && arr[i] >= arr[right] && isHeap(arr, left, n) && isHeap(arr, right, n)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 90, 15, 10, 7, 12, 2, 7, 3 };
		int n = arr.length - 1;
		if (isHeap(arr, 0, n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static int size(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + size(root.left) + size(root.right);
	}

	private static boolean isHeap(Node root, int i, int n) {
		if (root == null) {
			return true;
		}

		if (i >= n) {
			return false;
		}

		if ((root.left != null && root.left.data <= root.data)
				|| (root.right != null && root.right.data <= root.data)) {
			return false;
		}

		return isHeap(root.left, 2 * i + 1, n) && isHeap(root.right, 2 * i + 2, n);
	}

	public static boolean isHeap(Node root) {
		int i = 0;
		return isHeap(root, i, size(root));
	}

	class Node {
		int data;
		Node left;
		Node right;
	}

}
