public class Q2_Sum_In_Matrix {

    public static void matrixSum(int matrix[][]) {
        int sum = 0;

        // Using 2 loops
        // for (int i = 1; i < matrix.length-1; i++) { // i = rows
        //     for(int j = 0; j < matrix[0].length; j++) { // j = columns
        //         sum += matrix[i][j];
        //     }
        // }

        // Using 1 loop
        for(int j=0; j<matrix[0].length;j++) { // j = columns
            sum += matrix[1][j];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int input[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        matrixSum(input);
    }
}
