import java.util.Scanner;

public class Solid_Rhombus_Pattern {
    
    public static void solid_rhombus(int n) {
        
        for(int i=1;i<=n;i++) {
            // spaces - n
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            // stars - n
            for(int j=1;j<=n;j++) {
                System.err.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        solid_rhombus(n);
    }
}
