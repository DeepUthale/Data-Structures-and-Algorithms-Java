import java.util.Scanner;

public class Largest_of_3_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Greater Number is : " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Greater Number is : " + num2);
        }
        else{
            System.out.println("Greater Number is : " + num3);
        }
    }
}
