import java.util.Scanner;

public class Factorial {
    
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1;i<=n;i++) {
            fact = fact * i; 
        }
        return fact; // factorial of n
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int fa = factorial(f);
        System.out.println("Factorial of " + f + " is : " + fa);
    }
}
