package _7_Heap;

public class _8 {
	
	public void kthLargetElement(int[] arr, int k) {
		int n = arr.length;
		int startIndex = k / 2 - 1;

		for (int i = startIndex; i >= 0; i--) {
			heapify(arr, k, i);
		}

		System.out.println(arr[0]);

		for (int i = k; i < n; i++) {
			if (arr[i] < arr[0]) {
				arr[0] = arr[i];
				heapify(arr, k, 0);
			}
			System.out.println(arr[0]);
		}
	}

	private void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] > arr[largest])
			largest = l;

		if (r < n && arr[r] > arr[largest])
			largest = r;

		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);
		}
	}

}
