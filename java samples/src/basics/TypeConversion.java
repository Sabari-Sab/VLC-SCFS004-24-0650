package basics;

public class TypeConversion {
    public static void main(String[] args) {

        /*
         * String to Integer
         */
        String n = "123";
        int num = Integer.parseInt(n); // method to convert string to int
        System.out.println(num);

        /*
         * String to Double
         */
        String n1 = "123.44";
        double num1 = Double.parseDouble(n1); // method to convert string to double
        System.out.println(num1);

        /*
         * Number to String
         */
        int m = 1253;
        String s = Integer.toString(m); // method to convert int to string
        System.out.println(s);
        System.out.println(s.length()); // using a String method to confirm
    }

}
