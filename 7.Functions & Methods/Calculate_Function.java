import java.util.Scanner;

public class Calculate_Function {

    public static int calculatesum(int num1, int num2) { // parameters or formal parameters
        int sum = num1+ num2;
        return sum;
    }

    public static int calculatesub(int num1, int num2) { // parameters or formal parameters
        int sub = num1 - num2;
        return sub;
    }
    
    public static int calculatemul(int num1, int num2) { // parameters or formal parameters
        int mul = num1 * num2;
        return mul;
    }

    public static int calculatediv(int num1, int num2) { // parameters or formal parameters
        int div = num1 / num2;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calculatesum(a, b); // arguments or actual parameters
        System.out.println("Addition is : " + sum);

        int sub = calculatesub(a, b); // arguments or actual parameters
        System.out.println("Subtraction is : " + sub);

        int mul = calculatemul(a, b); // arguments or actual parameters
        System.out.println("Multiplication is : " + mul);
        
        int div = calculatediv(a, b); // arguments or actual parameters
        System.out.println("Division is : " + div);
    }
}
