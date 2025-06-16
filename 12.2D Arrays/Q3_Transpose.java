public class Q3_Transpose {

    public static void Transpose(int matrix[][]) {
        int row = matrix.length;
        int column = matrix[0].length;

        // Transpose matrix
        int transpose[][] = new int[column][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print matrix
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Print Transpose matrix
        for(int i=0;i<column;i++) {
            for(int j=0;j<row;j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 5, 6, 7 } };
        Transpose(matrix);
    }
}
