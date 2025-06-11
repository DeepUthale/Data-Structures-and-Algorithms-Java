import java.util.Scanner;

public class Butterfly_Pattern {
    
    public static void butterfly(int n) {
        for(int i=1;i<=n;i++) {
            // stars - i
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            // spaces - (2*i) - 1
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print("  ");
            }
            // stars - i
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--) {
            // stars - i
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            // spaces - (2*i) - 1
            for(int j=1;j<=2*(n-i);j++) {
                System.out.print("  ");
            }
            // stars - i
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        butterfly(n);    
    }
}
