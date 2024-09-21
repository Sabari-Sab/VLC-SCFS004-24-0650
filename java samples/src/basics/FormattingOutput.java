package basics;

public class FormattingOutput {
    public static void main(String[] args) {
        String name = "David", fname = "Alex", lname = "Tan";
        int age = 50, age1 = 35, age2 = 35;

        // print to console with a new line
        System.out.println(name + " is " + age + " years old.");

        // pring to console without a new line
        System.out.print("this does not add a new line");
        System.out.print("this adds  a new line \n");

        // adding a new line character (\ is the escape character)
        System.out.println("This is a text \n and this is some more");

        // using the format
        System.out.printf("%s is %d years old ", name, age);
        /*
         * %d: Decimal integer (e.g., 42).
         * %f: Floating-point number (e.g., 3.14).
         * %c: Character (e.g., 'a').
         * %s: String (e.g., "Hello").
         * %n: Platform-independent newline.
         */
        System.out.println();
        // Right justify the text in the output
        System.out.println("------------- Right Justify----------------------");
        System.out.printf("%10s  %4s %n", "Name", "Age");
        System.out.println("----------------------");
        System.out.printf("%10s  %4d %n", name, age);
        System.out.printf("%10s  %4d %n", fname, age1);
        System.out.printf("%10s  %4d %n", lname, age2);
        System.out.println("------------- Left Justify----------------------");
        // Left justify the text in the output
        System.out.printf("%14s%n", "----------------------");
        System.out.printf("\u001B[35m | %-10s | %-4s | %n \u001B[0m", "Name", "Age");
        System.out.printf("%14s%n", "---------------------");
        System.out.printf("\u001B[32m | %-10s | %-4d | %n \u001B[0m", name, age);
        System.out.printf("%14s%n", "---------------------");
        System.out.printf("\u001B[32m | %-10s | %-4d | %n \u001B[0m", fname, age1);
        System.out.printf("%14s%n", "---------------------");
        System.out.printf("\u001B[32m | %-10s | %-4d | %n \u001B[0m", lname, age2);
        System.out.printf("%14s%n", "---------------------");
    }
}
