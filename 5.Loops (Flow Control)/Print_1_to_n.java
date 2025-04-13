import java.util.Scanner;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter Any Number : ");
        int n =sc.nextInt();
        int counter = 1;
        
        System.out.println("");

        while (counter<=n) {
            System.out.println(counter);
            counter++;
        }
    }
}
