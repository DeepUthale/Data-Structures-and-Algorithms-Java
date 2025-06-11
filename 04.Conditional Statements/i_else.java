import java.util.Scanner;

public class i_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Adult : Drive, Vote");
        }

        else if (age >= 13 && age <= 18) {
            System.out.println("Teenager");
        }

        else {
            System.out.println("Not Adult, Nor Teen.");
        }
    }
}
