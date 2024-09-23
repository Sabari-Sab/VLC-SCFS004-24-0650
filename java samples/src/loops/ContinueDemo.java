package loops;

public class ContinueDemo {
    /*
     * a continue statement when encountered, exits the current iteration loop
     */
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i == 5) {
                continue; // when encountered the loop returns to the next iteration
            }
            // System.out.print(i + "\t"); // "\t is an escape character used to replace a
            // tab character"
        }
    }
}
