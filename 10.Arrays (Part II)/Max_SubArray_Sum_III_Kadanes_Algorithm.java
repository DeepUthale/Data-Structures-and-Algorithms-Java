public class Max_SubArray_Sum_III_Kadanes_Algorithm {

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;

        // First pass to check if all numbers are negative
        // and find maximun negative number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num >= 0) {
                allNegative = false;
                break;
            }

            maxNegative = Math.max(maxNegative, num);
        }

        // If all are negative return maximum
        if (allNegative) {
            System.out.println("All numbers are Negative, Max SubArray Sum is = " + maxNegative);
            return;
        }

        // Regular Kadane's Algorithm
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            // All negatives Set to zero
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Our max SubArray sum is = " + ms);
    }

    public static void main(String[] args) {
        int[] numbers = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int number1[] = { -2, -3, -6, -8, -9, -5, -7 };
        kadanes(numbers);
        kadanes(number1);
    }
}
