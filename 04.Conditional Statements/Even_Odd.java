import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Nmber is Even.");
        }
        
        else {
            System.out.println("Number is Odd");
        }
    }
}
