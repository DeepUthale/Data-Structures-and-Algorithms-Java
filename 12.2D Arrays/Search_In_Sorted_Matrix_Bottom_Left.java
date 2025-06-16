public class Search_In_Sorted_Matrix_Bottom_Left {

    public static void stair_case_Search(int matrix[][], int key) {
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return;
            }

            else if (key > matrix[row][col]) {
                col++; // Move Right in Columns
            } else {
                row--; // Move Up in Rows
            }
        }
        System.out.println("Key Not Found!");
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 30;
        stair_case_Search(matrix, key);
    }
}
