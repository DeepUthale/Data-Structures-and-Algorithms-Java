import java.util.Scanner;

public class ProductInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int pro = a * b;
        System.out.println(pro);
    }
}
