package _8_Graph;

public class _5 {

	boolean isSafe(int[][] M, int row, int col, boolean[][] visited) {
		return ((row >= 0) && (row < M.length) && (col >= 0) && (col < M[0].length)
				&& (M[row][col] == 1 && !visited[row][col]));
	}

	void DFS(int[][] M, int row, int col, boolean[][] visited, Count count) {
		int[] rowNbr = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] colNbr = { -1, 0, 1, -1, 1, -1, 0, 1 };

		visited[row][col] = true;

		for (int k = 0; k < 8; k++) {
			if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) {
				count.count++;
				DFS(M, row + rowNbr[k], col + colNbr[k], visited, count);
			}
		}
	}

	int largestRegion(int[][] M) {
		int ROW = M.length;
		int COL = M[0].length;
		boolean[][] visited = new boolean[ROW][COL];
		int result = 0;
		Count count = new Count();
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				if (M[i][j] == 1 && !visited[i][j]) {
					count.count = 1;
					DFS(M, i, j, visited, count);
					result = Math.max(result, count.count);
				}
			}
		}
		return result;
	}
	
	class Count{
		int count;
	}
}
