package loops;

public class Loops {
    public static void main(String[] args) {
        // for loop
        System.out.println("------- Demo of a for loop----------- \n");
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        // while loop
        System.out.println();
        System.out.println("------- Demo of a while loop-----------\n");
        int loopvar = 1;
        while (loopvar < 11) {
            System.out.print(loopvar + " ");
            loopvar++;
        }
        // do while loop
        loopvar = 1;
        System.out.println();
        System.out.println("------- Demo of a do while loop-----------\n");
        do {
            System.out.print(loopvar + " ");
            loopvar++;
        } while (loopvar < 11);
    }
}
