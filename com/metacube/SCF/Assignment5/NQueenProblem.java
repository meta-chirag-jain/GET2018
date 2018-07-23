package GET2018.com.metacube.SCF.Assignment5;

/**
 * This class solves n queen problem by backtracking.
 * @author Chirag Jain
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 */
public class NQueenProblem {

	/**
	 * Function to check if the position is safe for queen to put
	 * @param board is chess board
	 * @param row is current row
	 * @param col is current column
	 * @return yes if the position is safe for queen to put
	 */
	boolean isSafe(int[][] board, int row, int col) {

		int i, j;

		/* Check this column on upper side */
		for (i = 0; i < row; i++) {
			if (board[i][col] == 1) {
				return false;
			}		
		}
		
		/* Check upper diagonal on left side */
		for (i=row, j=col; i>=0 && j>=0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}		
		}
		
		/* Check upper diagonal on right side */
		for (i=row, j=col; i>=0 && j<board[0].length; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}		
		}
		return true;
	}
	
	/**
	 * This function use recursion to find solution.
	 * @param board is chess board
	 * @param row is current row
	 * @return true is solution is possible
	 */
	boolean solveNQUtil(int board[][], int row)
    {
        if (row >= board[0].length)
            return true;

        for (int j = 0; j < board[0].length; j++)
        {

            if (isSafe(board, row, j))
            {
                board[row][j] = 1;
 
                if (solveNQUtil(board, row + 1) == true)
                    return true;

                board[row][j] = 0;
            }
        }
        return false;
    }
	
	/**
	 * Function to check if solution exists.
	 * @param size is size of chess board
	 * @return true if a solution exists
	 */
	boolean solveNQ(int size)
    {
		if(size <= 0) {
			throw new AssertionError("Size must be greater than 0.");
		}
		
        int[][] board = new int[size][size];
 
        if (solveNQUtil(board, 0) == false)
        {
            System.out.println("Solution does not exist");
            return false;
        }
        
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
 
        return true;
    }
	
}

