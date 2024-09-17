package basics;

public class VariableDeclaration {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /*
         * declaring a variable involves specifying the data type followed by the
         * variable name.
         * You can also optionally assign a value to the variable at the time of
         * declaration.
         * Syntax
         * data_type variable_name;
         * data_type variable_name = value;
         */

        // declare integer type variable
        int age; // variable declared without initialization
        int sal = 1000; // variable declared without initialization

        // declare floating point variables
        double amount; // variable declared without initialization
        double price = 56.25; // variable declared without initialization

        // character type variables
        char initial; // variable declared without initialization
        char init = 'a'; // variable declared without initialization

        // boolean type variable
        boolean isValid = true;

        // String type variable
        String name;
        String firstName = "Alex";

        // delare multiple variables in a single line
        int x = 10, y = 20, z;

    }
}
