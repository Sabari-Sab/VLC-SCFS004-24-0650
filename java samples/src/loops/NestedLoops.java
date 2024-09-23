package loops;

public class NestedLoops {

    public static void main(String[] args) {
        /* print a multiplication table */
        for (int i = 1; i < 11; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        /* print all tables from 1 to 5 */
        for (int i = 1; i < 6; i++) { // outer loop
            for (int j = 1; j < 11; j++) { // inner loop
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("----------");
        }

        System.out.println("-------------------------------- Mixed loop types----------");
        // nesting a for loop within a while loop
        int i = 1;
        while (i < 6) { // outer loop
            for (int j = 1; j < 11; j++) { // inner loop
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            i++;
            System.out.println("----------");
        }
    }
}
