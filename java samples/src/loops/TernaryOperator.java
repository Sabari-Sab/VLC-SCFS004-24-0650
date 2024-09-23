package loops;

public class TernaryOperator {
    /*
     * shortcut for the if-else condition
     * Syntax
     * ------
     * <condition> ? "statement to be executed if true" :
     * "statement to be executed if false"
     */
    public static void main(String[] args) {
        int age = 14;
        String status = (age >= 18) ? "You can vote." : "You cannot Vote.";
        System.out.println(status);
    }
}
