import java.util.Scanner;

public class FLOYDs_Triangle {
    
    public static void FLD_Tri(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(counter+" ");
                counter++; // counter = new number
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int n = sc.nextInt();
        FLD_Tri(n);
    }
}
