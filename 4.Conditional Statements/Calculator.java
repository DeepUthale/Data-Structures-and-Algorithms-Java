import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Enter the Operation to Perform(+ - * / %) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(n1+n2);
                break;
            case '-': System.out.println(n1-n2);
                break;
            case '*': System.out.println(n1*n2);
                break;
            case '/': System.out.println(n1/n2);
                break;
            case '%': System.out.println(n1%n2);
                break;
            default: System.out.println("Invalid Input");
        }

    }
}
