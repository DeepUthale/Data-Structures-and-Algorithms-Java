import java.util.Scanner;

public class Math_Methods {
    
    public static void mathmeth(int n1, int n2) {
        System.out.println("Minimus of Two Numbers Is : "+ Math.min(n1, n2));

        System.out.println("Maximum of Two Numbers Is : " + Math.max(n1, n2));

        System.out.println("Square Root of First Number Is : " + Math.sqrt(n1));

        System.out.println("Second Number Raised To Power 2 Is : " + Math.pow(n2, 2));

        System.out.println("Absolute Value of First Number Is : " + Math.abs(n1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        mathmeth(n1, n2);
    }
}
