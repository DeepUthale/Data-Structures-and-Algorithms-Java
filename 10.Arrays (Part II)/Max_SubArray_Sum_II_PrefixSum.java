public class Max_SubArray_Sum_II_PrefixSum {

    public static void MaxSubSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        System.out.print("Prefix Array : ");
        System.out.print(prefix[0]+" ");

        // calculate prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.print(currSum+" ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        MaxSubSum(numbers);
    }
}