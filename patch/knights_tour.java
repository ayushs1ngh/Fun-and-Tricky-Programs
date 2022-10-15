// Java program for Knight Tour problem 

/*
Knight’s Tour problem.
The knight is placed on the first block of an empty board and, moving according to the rules of chess, must visit each square exactly once.

Backtracking algorithm for Knight’s tour problem.

If all squares are visited 
    print the solution

Else
   a) Add one of the next moves to solution vector and recursively 
   check if this move leads to a solution. (A Knight can make maximum 
   eight moves. We choose one of the 8 moves in this step).
   b) If the move chosen in the above step doesn't lead to a solution
   then remove this move from the solution vector and try other 
   alternative moves.
   c) If none of the alternatives work then return false (Returning false 
   will remove the previously added item in recursion and if false is 
   returned by the initial call of recursion then "no solution exists" )
*/

class KnightTour { 
	static int N = 8; 

	/* A utility function to check if i,j are valid indexes for N*N chessboard */
	static boolean isSafe(int x, int y, int sol[][]) { 
		return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1); 
	} 

	/* A utility function to print solution matrix sol[N][N] */
	static void printSolution(int sol[][]) { 
		for (int x = 0; x < N; x++) { 
			for (int y = 0; y < N; y++) 
				System.out.print(sol[x][y] + " "); 
			System.out.println(); 
		} 
	} 

	/* This function solves the Knight Tour problem using Backtracking. This function mainly uses solveKTUtil() to solve the problem. 	   	   It returns false if no complete tour is possible, otherwise return true and prints the tour. Please note that there may be more 	   	   than one solutions, this function prints one of the feasible solutions. 
	*/
	
	static boolean solveKT() { 
		int sol[][] = new int[8][8]; 

		/* Initialization of solution matrix */
		for (int x = 0; x < N; x++) 
			for (int y = 0; y < N; y++) 
				sol[x][y] = -1; 

	/* xMove[] and yMove[] define next move of Knight. 
	   xMove[] is for next value of x coordinate 
	   yMove[] is for next value of y coordinate 
	*/
	
	   int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
	   int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1}; 

		// Since the Knight is initially at the first block 
		sol[0][0] = 0; 

		/* Start from 0,0 and explore all tours using solveKTUtil() */
		if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) { 
			System.out.println("Solution does not exist"); 
			return false; 
		} else
			printSolution(sol); 

		return true; 
	} 

	/* A recursive utility function to solve Knight Tour problem */
	static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) { 
		int k, next_x, next_y; 
		if (movei == N * N) 
			return true; 

		/* Try all next moves from the current coordinate x, y */
		for (k = 0; k < 8; k++) { 
			next_x = x + xMove[k]; 
			next_y = y + yMove[k]; 
			if (isSafe(next_x, next_y, sol)) { 
				sol[next_x][next_y] = movei; 
				if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) 
					return true; 
				else
					sol[next_x][next_y] = -1;// backtracking 
			} 
		} 

		return false; 
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) { 
		solveKT(); 
	} 
} 