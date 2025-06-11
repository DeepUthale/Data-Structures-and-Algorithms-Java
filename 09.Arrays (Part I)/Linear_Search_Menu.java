import java.util.Scanner;

public class Linear_Search_Menu {

    public static int linearserachmenu(String Menu[], String key) {
        for (int i = 0; i < Menu.length; i++) {
            if (key.equals(Menu[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String Menu[] = { "samosa", "dosa", "chole bhature", "mango lassi", "puri bhaji" };

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Item : ");
        String key = sc.nextLine();
        String lower_key = key.toLowerCase();

        int index = linearserachmenu(Menu, lower_key);
        if (index == -1) {
            System.out.println("Sorry, We don't serve that food item.");
        } else {
            System.out.println("Your Order is coming right up!");
        }
    }
}
