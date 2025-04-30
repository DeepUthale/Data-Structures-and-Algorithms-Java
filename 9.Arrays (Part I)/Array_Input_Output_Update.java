import java.util.Scanner;

public class Array_Input_Output_Update {
    public static void main(String[] args) {
        int marks[] = new int[50];

        System.out.println("Length of array = " + marks.length);

        Scanner sc = new Scanner(System.in);
        //int phy = sc.nextInt();

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("Physics : "+marks[0]);
        System.out.println("Chemistry : "+marks[1]);
        System.out.println("Maths : "+marks[2]);

        // marks[2] = marks[2] + 1;
        // System.out.println("Maths : "+marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = "+percentage+" %");
    }
}
