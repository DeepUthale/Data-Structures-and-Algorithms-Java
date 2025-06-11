import java.util.Scanner;

public class Inverted_Rotated_Half_Pyramid {

    public static void IR_Half_Pyramid(int n) {
        for(int i=1; i<=n ; i++) {
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int n = sc.nextInt();
        IR_Half_Pyramid(n);
    }
}