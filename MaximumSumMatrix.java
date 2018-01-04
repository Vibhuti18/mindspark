package problems;

public class MaximumSumMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] aMatrix = { { 4, 5, 2 }, { -3, 7, 3 }, { -6, 1, -9 },
				{ 0, 99, 1 } };
		// Matrix.initialize(aMatrix);
		// Matrix.printMatrix(aMatrix);
		System.out.println(aMatrix[0].length);
		findMaximumSubMatrix(aMatrix);
	}

	private static void findMaximumSubMatrix(int[][] aMatrix) {
		// TODO Auto-generated method stub

		int[] oneD;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < aMatrix.length; i++) {
			oneD = new int[aMatrix[0].length];
			int current = 0;
			int maxCurrent = Integer.MIN_VALUE;
			
			
			for (int k = i; k < aMatrix.length; k++) 
			{
				current = 0;
				
				for (int j = 0; j < aMatrix[0].length; j++) 
				{
					oneD[j] = oneD[j] + aMatrix[k][j];
					current = current + oneD[j];
					if (current > maxCurrent) {
						maxCurrent = current;
					}
					if (current < 0) {
						current = 0;
					}
				}
				if (maxSum < maxCurrent)
					maxSum = maxCurrent;
			}
		}
		System.out.print(maxSum);
	}
}