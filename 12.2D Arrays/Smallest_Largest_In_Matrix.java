import java.util.Scanner;

public class Smallest_Largest_In_Matrix {

    public static void smallest_largest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest Element in Matrix is : " + smallest);
        System.out.println("Largest Element in Matrix is : " + largest);
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int m = matrix.length;
        int n = matrix[0].length;

        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        smallest_largest(matrix);
    }
}
