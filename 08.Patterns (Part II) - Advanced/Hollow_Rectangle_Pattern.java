import java.util.Scanner;

public class Hollow_Rectangle_Pattern {

    public static void hollow_rectangle(int rows, int colm) {
        // outer loop
        for(int i=1; i<=rows; i++) {
            // inner - columns
            for(int j=1; j<=colm;j++) {
                // cell - (i,j)
                if(i == 1 || i == rows || j == 1 || j == colm) {
                    // boundary cells
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns : ");
        int rows = sc.nextInt();
        int colm = sc.nextInt();
        hollow_rectangle(rows, colm);
    }
}
