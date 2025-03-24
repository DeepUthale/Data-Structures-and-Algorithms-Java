import java.util.Scanner;

public class Break {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Any Number Except Multiple of 10 : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
        } while(true);
    }
}
