package basics;

public class FormattingOutput {
    public static void main(String[] args) {
        String name = "David";
        int age = 50;
        // print to console
        System.out.println(name + " is " + age + " years old.");

        // using the format
        System.out.printf("%s is %d years old ", name, age);
        /*
         * %d: Decimal integer (e.g., 42).
         * %f: Floating-point number (e.g., 3.14).
         * %c: Character (e.g., 'a').
         * %s: String (e.g., "Hello").
         * %n: Platform-independent newline.
         */
    }
}
