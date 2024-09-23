package loops;

public class BreakDemo {
    /*
     * a break statement when encountered, exits the loop
     */
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            // System.out.print(i);
            if (i == 5) {
                break; // when encountered the loop exits from this line
            }
            System.out.print(i + "\t"); // "\t is an escape character used to replace a tab character"
        }
    }
}
