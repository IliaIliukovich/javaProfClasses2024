package lesson20240306;

import lesson20240304.ArrayExamples;

public class GenerateMatrix {

    public static void main(String[] args) {
        int[][] result = generateMatrix(9, 5);
        ArrayExamples.print2DArray(result);

        System.out.println("---");

        result = generateMatrix(5, 5);
        ArrayExamples.print2DArray(result);
    }

    public static int[][] generateMatrix(int n, int m) {
        int[][] result = new int[n][m];
        for (int i = 0; i < Math.min(n, m); i++) {
            result[i][i] = 1;
        }
        return result;
    }


}
