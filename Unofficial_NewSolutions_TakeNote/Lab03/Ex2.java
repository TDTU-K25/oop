public class Ex2 {
    public static int[][] addTwoMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) { // matrixA.length -> rows of matrix
            for (int j = 0; j < matrixA[i].length; j++) { // matrixA[i].length -> column of matrix
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC;
    }

    public static int[][] multiplyMatrixWithNum(int[][]  matrix, int num) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = num * matrix[i][j];
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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
