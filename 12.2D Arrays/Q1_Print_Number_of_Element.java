public class Q1_Print_Number_of_Element {

    public static void FindNumber1(int matrix[][], int key) {
        // Linear Search Approach
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) { // i is Row Number
            for (int j = 0; j < matrix[0].length; j++) { // j is Column Number
                if (matrix[i][j] == key) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static void FindNumber2(int matrix[][], int key) {
        // Binary Search Approach
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;
        int counter1 = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row = mid / cols;
            int col = mid % cols;

            // comparison
            if (matrix[row][col] == key) {
                counter1++;
            }

            if (matrix[row][col] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        System.out.println(counter1);
    }
    // Deep Uthale
    public static void main(String[] args) {
        int[][] input = { { 4, 7, 8 }, { 7, 8, 7 } };
        FindNumber1(input, 7);

        int[][] input1 = { { 4, 5, 6 }, { 7, 7, 8 } };
        FindNumber2(input1, 7);
    }
}
