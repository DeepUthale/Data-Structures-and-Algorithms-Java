import java.util.Scanner;

public class Function_Overloading_Parameters {
    
    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum_two = sum(a, b);
        System.out.println(sum_two);

        System.out.println("Enter your three Numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();
        int sum_three =  sum(a, b, c);
        System.out.println(sum_three);
    }
}
