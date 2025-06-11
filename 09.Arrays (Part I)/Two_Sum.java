public class Two_Sum {

    public static int TwoSum(int numbers[], int sum) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int twosum = numbers[i] + numbers[j];
                if (twosum == sum) {
                    System.out.print("The index are : " + i + " " + j);
                    System.out.println();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int sum = 16;
        TwoSum(numbers, sum);
    }
}