import java.util.Scanner;

public class CircleArea {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();

        float c_area = 3.14f * r * r;
        System.out.println(c_area);
    }
}
