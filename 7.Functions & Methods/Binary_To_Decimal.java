import java.util.Scanner;

public class Binary_To_Decimal {

    public static void binToDec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        
        System.out.println("Decimal of " + mynum + " = " + decNum);    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in Binary : ");
        int binNum = sc.nextInt();
        binToDec(binNum);
    }
}