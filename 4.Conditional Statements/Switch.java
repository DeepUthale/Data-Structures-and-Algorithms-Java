import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number From 1 To 3 : ");
        int num = sc.nextInt();

        switch(num) {
            case 1 : System.out.println("You got a Burger!");
                break;
            case 2 : System.out.println("You got a Cookee!");
                break;
            case 3 : System.err.println("You got Pizza!");
                break;
            default: System.out.println("Wrong Input, You got Nothing.");
        }
    }
    
}
