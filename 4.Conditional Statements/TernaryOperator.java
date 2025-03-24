import java.util.Scanner;

public class TernaryOperator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        //odd or even
        String type = ((num1 % 2) == 0) ? "Even" : "Odd";
        System.out.println(type);

        //Largest of two
        int lrg = (num1 > num2) ? num1 : num2;
        System.out.println(lrg);

        //Pass or Fail
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int marks = sc.nextInt();

        String status = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(status);
    }
}
