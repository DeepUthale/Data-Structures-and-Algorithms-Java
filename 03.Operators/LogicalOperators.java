public class LogicalOperators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println((5>0) && (3>2));
        System.out.println((5<0) && (3>2));
        System.out.println((5>0) && (3<2));
        System.out.println((5<0) && (3<2));

        System.out.println((5>0) || (3>2));
        System.out.println((5<0) || (3>2));
        System.out.println((5>0) || (3<2));
        System.out.println((5<0) || (3<2));

        System.out.println(!(3>2));
        System.out.println(!(3<2));
    }
}
