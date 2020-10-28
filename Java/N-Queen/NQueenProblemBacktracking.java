import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class NQueenProblemBacktracking {
	public static PrintWriter out = new PrintWriter(System.out);
	public static QueenPosition[] chessBoard;

	public static void main(String[] args) {

		System.out.println("Enter Number of Queens");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		chessBoard = new QueenPosition[N];
		if (getSolution(N, 0)) {
			int[][] result = new int[N][N];

			Arrays.stream(chessBoard).forEach(po -> result[po.row][po.col] = 1);

			out.println("Display using Stream API \n-----------------------");

			Arrays.stream(result).forEach(rw -> {
				Arrays.stream(rw).forEach(rw1 -> out.print(rw1 + " "));
				out.println();
			});

			out.println("\n\nDisplay using normal For loop \n---------------------------");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					out.print(result[i][j] + " ");
				}
				out.println();
			}
		} else {
			out.println("Solution not available.");
		}

		out.flush();

	}

	public static boolean getSolution(int n, int row) {
		if (n == 2 || n == 3)
			return false;

		if (row == n)
			return true;

		for (int col = 0; col < n; col++) {
			boolean isSafe = true;
			chessBoard[row] = new QueenPosition(row, col);

			for (int placedQueen = 0; placedQueen < row; placedQueen++) {
				if (chessBoard[placedQueen].col == col
						|| chessBoard[placedQueen].row - chessBoard[placedQueen].col == row - col
						|| chessBoard[placedQueen].row + chessBoard[placedQueen].col == row + col) {
					isSafe = false;
				}
			}

			if (isSafe) {
				if (getSolution(n, row + 1))
					return true;
			}
		}
		return false;
	}

}

class QueenPosition {
	int row;
	int col;

	public QueenPosition(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
}