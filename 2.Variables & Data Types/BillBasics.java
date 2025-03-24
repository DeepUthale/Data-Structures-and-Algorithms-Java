import java.util.Scanner;

public class BillBasics {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost of Pen : ");
        float pen = sc.nextFloat();
        System.out.println("Enter the Cost of Pencil : ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the Cost of Eraser : ");
        float eraser = sc.nextFloat();

        float bill = pen + pencil + eraser;
        float final_bill = (float) (bill + bill * 0.18);
        System.out.println("Final Bill is : "+final_bill);
    }
}
