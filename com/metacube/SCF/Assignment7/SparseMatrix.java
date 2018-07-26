package GET2018.com.metacube.SCF.Assignment7;

public final class SparseMatrix {

	private int[][] sparseMatrix;
	private int rows;
	private int columns;
	
	private static final int VALUE = 0;
    private static final int ROW_NUMBER = 1;
    private static final int COL_NUMBER = 2;
	
	public SparseMatrix(int[][] givenArray) {
		int length = 0;
		int maxColLength = 0;														//if user gives different column size in different rows
		
		if(givenArray == null) {
			throw new AssertionError("Cant be null.");
		}
		
		//to count length of non zero numbers
		for(int row = 0; row < givenArray.length; row++) {
			for(int col = 0; col < givenArray[row].length; col++) {
				if(givenArray[row][col] != 0) {
					length++;
				}
				if(givenArray[row].length > maxColLength) {
					maxColLength = givenArray[row].length;
				}
			}
		}
		
		//create array of size of non zero elements
		int[][] matrix = new int[length][3];
		int index = 0;
		for(int row = 0; row < givenArray.length; row++) {
			for(int col = 0; col < givenArray[row].length; col++) {
				if(givenArray[row][col] != 0) {
					matrix[index][VALUE] = givenArray[row][col];
					matrix[index][ROW_NUMBER] = row;
					matrix[index][COL_NUMBER] = col;
					index++;
				}
			}
		}
		
		this.rows = givenArray.length;
		this.columns = maxColLength;
		this.sparseMatrix = matrix;
		
	}
	
	public int[][] transpose() {
		int[][] transpsoeArray = new int[sparseMatrix.length][3];
		
		for(int i = 0; i < sparseMatrix.length; i++) {
			transpsoeArray[i][VALUE] = sparseMatrix[i][VALUE];
			transpsoeArray[i][ROW_NUMBER] = sparseMatrix[i][COL_NUMBER];			//row to col
			transpsoeArray[i][COL_NUMBER] = sparseMatrix[i][ROW_NUMBER];			//col to row
		}		
		return transpsoeArray;
	}
	
	public boolean isSymmetrical() {
		if(rows != columns) {
			return false;
		}
		
		int[][] sparseTranspose = transpose();
		int tempRow, tempCol;
		
		for(int i = 0; i < sparseMatrix.length; i++) {
			tempRow = sparseTranspose[i][ROW_NUMBER];
			tempCol = sparseTranspose[i][COL_NUMBER];
			if(sparseTranspose[i][VALUE] != getValue(tempRow, tempCol)) {
				return false;
			}
		}
		return true;
	}
	
	public int[][] getMatrix() {
		int[][] matrix = new int[rows][columns];
		int row, column;
		for(int i = 0; i < sparseMatrix.length; i++) {
			row = sparseMatrix[i][ROW_NUMBER];
			column = sparseMatrix[i][COL_NUMBER];
			matrix[row][column] = sparseMatrix[i][VALUE];
		}
		return matrix;
	}
	
	private int getValue(int row, int col) {
		for(int i = 0; i < sparseMatrix.length; i++) {
			if(sparseMatrix[i][1] == row && sparseMatrix[i][2] == col) {
				return sparseMatrix[i][0];
			}
		}
		return 0;
	}
	
	public static int[][] addMatrices(SparseMatrix sm1, SparseMatrix sm2) {
		if(sm1.rows != sm2.rows || sm1.columns != sm2.columns) {
			throw new AssertionError("Array Size Mismatch.");
		}
		
		int[][] sumArray = new int[sm1.rows][sm1.columns];
		
		for(int i = 0; i < sm1.rows; i++) {
			for(int j = 0; j < sm1.columns; j++) {
				sumArray[i][j] = sm1.getValue(i, j) + sm2.getValue(i, j);
			}
		}
		
		int[][] FinalSumArray = new SparseMatrix(sumArray).getMatrix();
		return FinalSumArray;
	}
	
	public static int[][] multiplyMatrices(SparseMatrix sm1, SparseMatrix sm2) {
		
		if(sm1.columns != sm2.rows) {												//coz a*b and b*c is possible multiplication
			throw new AssertionError("Cant be multiplied");
		}
		
		int[][] mulArray = new int[sm1.rows][sm2.columns];
		
		for(int i = 0; i < sm1.rows; i++) {											//row of 1st = a
			for(int j = 0; j < sm2.columns; j++) {									//col of 2nd = c
				for(int k = 0; k <= sm1.columns; k++) {								//same value for both = b
					mulArray[i][j] += sm1.getValue(i, k) * sm2.getValue(k, j);
				}				
			}
		}
		
		int[][] FinalMulArray = new SparseMatrix(mulArray).getMatrix();
		return FinalMulArray;
	}
}
