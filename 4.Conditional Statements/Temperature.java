public class Temperature {
    public static void main(String[] args) {
        double temp = 103.5;

        // if (temp > 100) {
        //     System.out.println("You have a fever.");
        // }
        // else {
        //     System.out.println("You don't have a fever.");
        // }

        String status = (temp > 100) ? "You have a fever." : "You don't have a fever.";
        System.out.println(status);
    }
}
