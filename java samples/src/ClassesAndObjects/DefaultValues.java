package classesandobjects;

public class DefaultValues {
    // Instance variable are global in scope
    // instance variables need not be instantiated
    int i;
    double d;
    boolean b;
    String s;
    char c;

    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();
        System.out.println("The default values of a Instance variables");
        System.out.println("------------------");
        System.out.println("The default value of number type is :" + defaultValues.i);
        System.out.println("The default value of decimal type is :" + defaultValues.d);
        System.out.println("The default value of boolean type is :" + defaultValues.b);
        System.out.println("The default value of String type is :" + defaultValues.s);
        System.out.println("The default value of char type is :" + defaultValues.c); // is always '\u0000' and invisible
                                                                                     // character that is null character
        // local variable
        // needs to be instantiated before use
        int count;
        // System.out.println(count); // error as the count is not instantiated
        count = 0;
        System.out.println(count);

    }

}
