package basics;

public class BoxingUnboxing {
    public static void main(String[] args) {
        /*
         * Boxing and Unboxing in Java are concepts related to converting
         * between primitive data types and their corresponding wrapper class objects
         * 
         * Completely implicit
         * 
         * These processes make it easier to work with primitive data types as objects
         * when necessary,
         * such as when using collections like ArrayList that only store objects.
         */

        // Boxing (AutoBoxing)
        // Boxing is the process of converting a primitive data type
        // into its corresponding wrapper class object.
        int num = 10; // primitive type
        Integer n = num; // AutoBoxing from primitive to Wrapper Class
        System.out.println(n); // printing the Wrapper class object

        // unboxing
        // Unboxing is the reverse process, where a wrapper class object is converted
        // back into its corresponding primitive data type.
        Integer boxed = 20; // Wrapper class
        int m = boxed; // unboxing from wrapper class to primitive
        System.out.println(m); // printing the primitive type
    }
}
