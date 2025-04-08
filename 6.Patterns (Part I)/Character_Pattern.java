public class Character_Pattern {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.err.print(ch);
                ch++;
            }
            System.out.println();
        }

        //Outer Loop
        for(int line=1;line<=n;line++) {
            //Inner Loop
            for(int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
