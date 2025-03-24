public class TypePromotionInExpression {
    public static void main(String[] args) {
        // Java automatically promotes each byte, short, or char operand to int 
        // when evaluating an expression.
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a);
        System.out.println(b-a+"\n");

        short sh = 25;
        byte by = 25;
        char c = 'c';
        byte bt = (byte) (sh + by + c);
        System.out.println(bt+"\n");

        // If one operand is long, float or double the whole expression
        // is promoted to lonf, float, or double respectively.

        int a1 = 10;
        float b1 = 20.25f;
        long c1 = 25;
        double d = 30.12;
        double ans = a1 + b1 + c1 + d;
        System.out.println(ans+"\n");

        byte b2 = 5;
        byte a2 = (byte) (b2 * 2);
        System.out.println(a2);
    }
}
