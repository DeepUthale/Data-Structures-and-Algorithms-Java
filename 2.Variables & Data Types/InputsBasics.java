import java.util.*;

public class InputsBasics {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        boolean var = sc.nextBoolean();
        System.out.println(var);

        short sh = sc.nextShort();
        System.out.println(sh);

        long ln = sc.nextLong();
        System.out.println(ln);
    }
}
