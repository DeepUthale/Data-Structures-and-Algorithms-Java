import java.util.Scanner;

public class ForLoop {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Hello World!");
        }
    }
}
