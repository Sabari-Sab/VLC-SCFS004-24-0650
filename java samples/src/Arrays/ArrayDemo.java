package Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // syntax to declare an array without initialization
        // datatype[] arrayName;
        // syntax to declare an array with initialization
        // datatype[] arrayName={values};

        /*
         * Notes
         * 1. Arrays are of fixed size (# elements)
         * 2. Arrays have zero based index
         * 3. an Exception is rised when an accessing an idex that is not available
         */

        String[] names = { "Alex", "Sara", "James" };
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        int[] salaries;
        salaries = new int[3]; // assigning a size
        salaries[0] = 1000; // assigning the values to elements
        salaries[1] = 2000; // assigning the values to elements
        salaries[2] = 3000; // assigning the values to elements
        // salaries[3] = 3000; // error
        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);

        // Multi dimentional Arrays
        int[][] tab = { { 1, 2 }, { 3, 4 } };
        System.out.println(tab[0][0]);
        System.out.println(tab[0][1]);
        System.out.println(tab[1][0]);
        System.out.println(tab[1][1]);

        int[][] table = new int[2][2];
        table[0][0] = 10;
        table[0][1] = 20;
        table[1][0] = 30;
        table[1][1] = 40;
        System.out.println(table[0][0]);
        System.out.println(table[0][1]);
        System.out.println(table[1][0]);
        System.out.println(table[1][1]);
    }
}
