import java.util.Scanner;

public class Hollow_Rhombus_Pattern {
    
    public static void hollow_rhombus(int n) {
        for(int i=1;i<=n;i++) {
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                // stars
                if(i==1 || j==1 || i==n || j==n) {
                    System.out.print(" *");
                }
                // spaces
                else{
                    System.err.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        hollow_rhombus(n);
    }
}
