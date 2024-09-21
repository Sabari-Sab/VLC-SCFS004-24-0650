package basics;

public class DataTypes {
    public static void main(StringDemo[] args) {
        /*
         * Primitve Types
         * byte
         * short
         * int
         * long
         * float
         * double
         * char
         * boolean
         */
        /*
         * object types
         * String
         * Array
         * Byte
         * Short
         * Integer
         * Long
         * Float
         * Double
         * Character
         * Boolean
         * ---- many more built-in and custom object can also be present
         */

        /*
         * Size allocation for each type
         * byte -- 8 bit signed
         * short -- 16 bit signed
         * int -- 32 bit signed
         * long -- 64 bit signed
         * float -- 32 bit signed
         * double -- 64 bit signed
         * char -- 16 bit
         * boolean -- 1 bit
         */

        // usage of primitive types
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000;
        float f = 100.25f;
        double d = 1000.75;
        char initial = 'A';
        char init = '\u0041';
        boolean isValid = true;

        System.out.println("-----------Usage of Primitive types--------------------- ");
        System.out.println("The value of byte variable is " + b);
        System.out.println("The value of short variable is " + s);
        System.out.println("The value of int variable is " + i);
        System.out.println("The value of long variable is " + l);
        System.out.println("The value of float variable is " + f);
        System.out.println("The value of double variable is " + d);
        System.out.println("The value of char variable is " + initial);
        System.out.println("The value of char variable using the unicode value is " + init);
        System.out.println("The value of boolean variable is " + isValid);
        // primitive types do not have methods and attributes

        System.out.println("-----------Usage of Object types--------------------- ");

        // usage of object type
        String name = "Alex";
        System.out.println("The value of the String type variable is " + name);
        // object types have methods and attributes
        System.out.println(name.length()); // accesing a method of a string object

    }
}
