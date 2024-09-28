package methods.staticmethods;

public class MethodOverload {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static String add(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add("Hello", "World"));
    }

}

/*
 * Polymorphism with Method Overload
 * Compile-time polymorphism
 * same method behave differently with different parameters
 * 
 */