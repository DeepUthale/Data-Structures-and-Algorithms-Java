import java.util.Scanner;

public class SquareArea {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float s = sc.nextFloat();
        float area = s * s;
        System.out.println(area);
    }
}
