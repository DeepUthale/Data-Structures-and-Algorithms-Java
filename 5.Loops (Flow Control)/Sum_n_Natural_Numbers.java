import java.util.Scanner;

public class Sum_n_Natural_Numbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        
        int counter = 1;
        int sum = 0;

        while (counter<=n) {
            sum += counter;
            counter++;    
        }
        System.out.println("The Sum Of First " + n + " Natural Numbers is " + sum);
    }
}
