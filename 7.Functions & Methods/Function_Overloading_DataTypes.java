import java.util.Scanner;

public class Function_Overloading_DataTypes {
    
    public static int sum(int a, int b) {
        return a+b;
    }

    public static float sum(float a1, float b1) {
        return a1+b1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum_int = sum(a, b);
        System.out.println(sum_int);

        System.out.println("Enter Two Decimal Numbers : ");
        float a1 = sc.nextFloat();
        float b1 = sc.nextFloat();
        float flt_sum = sum(a1, b1);
        System.err.println(flt_sum);
    }
}
