import java.util.Scanner;

public class Continue {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Any Number Except Multiple of 10 Which Will Not Print : ");
            int i = sc.nextInt();

            if(i % 10 == 0) {
                continue;
            }
            System.out.println("Number Was "+i);
        } while(true);
    }
}
