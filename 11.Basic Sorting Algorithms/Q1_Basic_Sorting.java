public class Q1_Basic_Sorting {

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Bubble Sort : ");
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Selection Sort : ");
    }

    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev + 1] = curr;
        }
        System.out.println("After Insertion Sort : ");
    }

    public static void countingSort(int arr[]) {
        // Find the largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Count the frequency of elements
        int count[] = new int[largest + 1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("After Counting Sort : ");
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        int arr1[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        int arr2[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        int arr3[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        bubbleSort(arr);
        printArr(arr);

        selectionSort(arr1);
        printArr(arr1);

        insertionSort(arr2);
        printArr(arr2);

        countingSort(arr3);
        printArr(arr3);
    }
}
