import java.util.Scanner;

public class Income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary : ");
        float sal = sc.nextFloat();
        float tax;

        if (sal < 500000) {
            tax = 0;
        }
        else if (sal >= 500000 && sal < 1000000) {
            tax = sal * 0.2f;
        }
        else {
            tax = sal * 0.3f;
        }
        System.out.println("Your Tax is : " + tax);
    }
}
