public class Inverted_Star_Pattern {
    public static void main(String[] args) {
        // Solution 1
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.err.println();
        }

        // Solution 2
        int n = 4;
        for(int line=1;line<=n;line++) {
            for(int star=1; star<=(n-line+1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
