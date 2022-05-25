public class Ex2 {
    public static int[][] addTwoMatrices(int[][] matrixA, int[][] matrixB) {
        int row = matrixA.length;
        int col = matrixA[0].length; 
        int[][] matrixC = new int[row][col];
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) { 
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC;
    }

    public static int[][] multiplyMatrixWithNum(int[][]  matrix, int num) {
        int row = matrix.length;
        int col = matrix[0].length; 
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = num * matrix[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length; 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = { {3,5,2}, 
                            {4,0,8}, 
                            {5,9,10}};

        int[][] matrixB = { {7,1,5}, 
                            {9,6,4}, 
                            {8,3,7}};
  
        System.out.println("Matrix: ");
        printMatrix(addTwoMatrices(matrixA, matrixB));

        System.out.println();

        System.out.println("Matrix: ");
        printMatrix(multiplyMatrixWithNum(matrixA, 3));
    }
}
