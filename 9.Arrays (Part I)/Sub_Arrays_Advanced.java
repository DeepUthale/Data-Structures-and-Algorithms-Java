public class Sub_Arrays_Advanced {

    public static void SubArrayAdv(int numbers[]) {
        int sum;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) { // start
            int start = i;
            for (int j = i; j < numbers.length; j++) { // end
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) { // subarrays
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                // Update largest and smallest subarray sums
                if (sum > largest) {
                    largest = sum;
                }
                if (sum < smallest) {
                    smallest = sum;
                }

                System.out.print("  Sum of SubArray is : " + sum);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Largest Subarray Sum is: " + largest);
        System.out.println("Smallest Subarray Sum is: " + smallest);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        SubArrayAdv(numbers);
    }
}
