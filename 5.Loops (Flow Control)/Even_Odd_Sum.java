import java.util.Scanner;

public class Even_Odd_Sum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum_even = 0;
        int sum_odd = 0;
        int choice;
        
        do {
            System.out.println("Enter Your Number : ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                sum_even += num;
            }
            else {
                sum_odd += num;
            }

            System.out.println("Do You Want To Continue? Press 1 for Yes or 0 for No : ");
            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("Sum of Even Numbers : " + sum_even);
        System.out.println("Sum of Odd Numbers : " + sum_odd);
        
    }
}
