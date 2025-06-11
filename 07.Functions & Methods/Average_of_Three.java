import java.util.Scanner;

public class Average_of_Three {

    public static int avg(int n1, int n2, int n3) {
        int avg = (n1 +n2 + n3) / 3;
        return avg;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Three Numbers : ");
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

         int avg = avg(n1, n2, n3);
         System.out.println("Average of Three Numbers is : " + avg);
    }
}