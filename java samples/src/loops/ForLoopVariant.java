package loops;

public class ForLoopVariant {
    public static void main(String[] args) {
        int i = 3;

        // using the variable declared in the scope of the loop
        for (; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------");

        // using the variable declared in the scope of the loop with a changed value
        for (i = 4; i < 11; i++) {
            System.out.println(i);
        }
    }
}
