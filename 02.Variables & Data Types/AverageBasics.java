import java.util.Scanner;

public class AverageBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks Of Three Subjects :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (float) (a + b + c) / 3;
        System.out.println("Average is : "+avg);
    }
}
