public class Largest_Smallest_In_Array {

    public static int get_largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // - Infinity
        int smallest = Integer.MAX_VALUE; // + Infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5, 8 };
        System.out.println("Largest value is : " + get_largest(numbers));
    }
}
