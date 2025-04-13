import java.util.Scanner;

public class Decimal_To_Binary {
    
    public static void decTobin(int n) {
        int mynum = n;
        int pow = 0;
        int binNum= 0;
        
        while(n>0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n/2;
        }

        System.out.println("Binary form of " + mynum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in Decimal : ");
        int decNum = sc.nextInt();
        decTobin(decNum);
    }
}
