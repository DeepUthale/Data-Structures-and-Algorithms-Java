import java.util.Scanner;

public class Positive_Negative {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("It is a Positive Number.");
        }
        else if (num == 0) {
            System.out.println("It is neither Positive nor Negative Number.");
        }
        else {
            System.out.println("It is a Negative Number.");
        }
    }
}
