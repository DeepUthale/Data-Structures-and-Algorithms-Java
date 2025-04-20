import java.util.Scanner;

public class Inverted_Half_Pyramid_Soln_2 {
    
    public static void IH_Pyramid_Solution_2(int n) {
        for(int i=1;i<=n;i++) {
            // inner - numbers
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int n =sc.nextInt();
        IH_Pyramid_Solution_2(n);
    }
}
