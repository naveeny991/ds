package _7_Heap;

public class _2 {

	public static void kthLargetElement(int[] arr, int k) {

		int n = arr.length;

		int startIndex = k / 2 - 1;

		for (int i = startIndex; i >= 0; i--) {
			heapify(arr, k, i);
		}

		System.out.println(arr[0]);

		for (int i = k; i < n; i++) {
			if (arr[i] > arr[0]) {
				arr[0] = arr[i];
				heapify(arr, k, 0);
			}
			System.out.println(arr[0]);
		}
	}

	private static void heapify(int arr[], int n, int i) {
		int min = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] < arr[min])
			min = l;

		if (r < n && arr[r] < arr[min])
			min = r;

		if (min != i) {
			int swap = arr[i];
			arr[i] = arr[min];
			arr[min] = swap;

			heapify(arr, n, min);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		kthLargetElement(arr, 3);
	}

}
