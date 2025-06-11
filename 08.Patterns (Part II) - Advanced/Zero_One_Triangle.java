import java.util.Scanner;

public class Zero_One_Triangle {

    public static void ZO_Tri(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop (columns)
            for (int j = 1; j <= i; j++) {
                // i + j == even = 1
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } 
                // i + j == odd = 0
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int n =sc.nextInt();
        ZO_Tri(n);
    }
}
