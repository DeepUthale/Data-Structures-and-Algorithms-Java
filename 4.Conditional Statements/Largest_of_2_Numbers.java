import java.util.Scanner;

public class Largest_of_2_Numbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("First Number is Greater, " + n1);
        }

        else if (n1 < n2) {
            System.out.println("Second Number is Greater, " + n2);
        }

        else {
            System.out.println("Two Numbers are Equal.");
        }
    }
}
