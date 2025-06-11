import java.util.Scanner;

public class Sum_of_Digits_in_Integer {
    
    public static void sumint(int num) {
        int sum = 0;
        int mynum = num;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println("The Sum of Digits in " + mynum + " is " + sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        sumint(num);
    }
}
