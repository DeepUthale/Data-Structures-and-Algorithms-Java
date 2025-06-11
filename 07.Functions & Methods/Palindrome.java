import java.util.Scanner;

public class Palindrome {
    
    public static void isPal(int num) {
        int rev = 0;
        int mynum = num;
        while (num > 0) {
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit;
            num = num / 10;
        }
        if(rev == mynum){
            System.out.println("The Number " + mynum + " is Palindrome.");
        }
        else {
            System.out.println("The Number " + mynum + " is Not a Palindrome.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        isPal(num);
    }
}
