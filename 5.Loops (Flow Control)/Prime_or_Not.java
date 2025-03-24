import java.util.Scanner;

public class Prime_or_Not {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        for(int i=2;i<=(num/2);i++) {
            if(num % i == 0){
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(num + " is prime.");
        }
        else {
            System.out.println(num + " is not prime.");
        }
    }
}
