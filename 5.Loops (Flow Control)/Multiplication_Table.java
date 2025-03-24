import java.util.Scanner;

public class Multiplication_Table {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();
        System.out.println("");
        

        for(int i=1;i<=10;i++) {
           System.out.println(num + " * " + i + " = " +  num * i);
        }
    }
}
