import java.util.Scanner;

public class Inverted_Half_Pyramid {
    
    public static void IH_Pyramid(int n) {
        // outer loop
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int n = sc.nextInt();
        IH_Pyramid(n);
    }
}
