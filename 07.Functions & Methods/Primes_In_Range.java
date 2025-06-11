import java.util.Scanner;

public class Primes_In_Range {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimesInRange(int n) {
        for(int i=2;i<=n;i++) {
            if (isPrime(i)) { // true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range : ");
        int n = sc.nextInt();
        PrimesInRange(n); // 2 to n
    }
}