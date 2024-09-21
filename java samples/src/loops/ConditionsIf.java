package loops;

public class ConditionsIf {
    public static void main(String[] args) {
        int x = 10, y = 20;
        /*
         * in any of the blocks (if/else if / else) if there is more than one line of
         * executable code use the {}
         */

        // basic syntax of a if block
        if (x > y) {
            System.out.println("good");
        }

        // else if block (there can be more than one else if block)
        if (x > y) {
            System.out.println("good");
        } else if (x < y) {
            System.out.println("bad");
        }

        // complete syntax of the if block including the else
        if (x == y) {
            System.out.println("good");
        } else if (x > y) {
            System.out.println("bad");
        } else
            System.out.println("ugly");

        // using the condition with a boolean variable
        boolean res;
        res = x > y;
        if (res)
            System.out.println("yes");

    }
}
