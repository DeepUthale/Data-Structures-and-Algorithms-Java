import java.util.Scanner;

public class Binomial_Coefficient {

    public static int Factorial(int j) {
        int fact = 1;
        for(int i=1;i<=j;i++) {
            fact = fact * i;
        }
        return fact; // factorial of n
    }
    
    public static int BinomialCof(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);

        int BinomialCof = fact_n / (fact_r * fact_nmr);
        return BinomialCof;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int BinoCoe = BinomialCof(n, r);
        System.out.println("Binomial Coefficient : " + BinoCoe);
    }
}