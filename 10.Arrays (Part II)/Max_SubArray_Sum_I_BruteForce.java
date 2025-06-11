public class Max_SubArray_Sum_I_BruteForce {

    public static void MaxSubSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) { // print
                    System.out.print(numbers[k] + " ");
                    // subarray sum
                    currSum += numbers[k];
                }
                System.out.print("  Sum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2, 6, -1, 3 };
        MaxSubSum(numbers);
    }
}
