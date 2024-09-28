package methods.staticmethods;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20, 30, 40, 50));
        System.out.println(add(10, 20, 30, 40, 50, 60, 70));
        System.out.println(add(10.4, 20, 30.5, 40, 50.44, 60, 70));
        System.out.println(add("Hello", "World"));
    }

    public static int add(int a, int b, int c) { // increased the # of parameters
        return a + b + c;
    }

    public static int add(int x, int y) { // original method
        return x + y;
    }

    public static String add(String x, String y) { // changed the types of parameters
        return x + y;
    }

    public static double add(double... x) { // use of variable arguments
        double res = 0;
        for (double i : x) {
            res += i;
        }
        return res;
    }

    public static int add(int... x) { // use of variable arguments
        int res = 0;
        for (int i : x) {
            res += i;
        }
        return res;
    }

}

/*
 * Polymorphism with Method Overload
 * Compile-time polymorphism
 * same method behave differently with different parameters
 * 
 */