import java.util.Scanner;

public class Prime_or_Not {
    // only for n>=2
    public static boolean isprime(int n) {
        // Edge cases
        // 2
        if(n==2){
            return true;
        }

        // boolean isprime = true;
        for(int i=2;i<=n-1;i++) {
            if (n % i == 0) {// completely dividing
                // isprime = false;
                // break;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
}
