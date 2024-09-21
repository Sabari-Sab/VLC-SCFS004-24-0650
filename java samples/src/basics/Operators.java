package basics;

public class Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("----------------Arithmetic Operators----------------");
        System.out.println(x + y); // Addition operator
        System.out.println(x - y); // Subtraction operator
        System.out.println(x * y); // Multiplication operator
        System.out.println(x / y); // Division operator
        System.out.println(x % y); // Modulus operator
        System.out.println("------------ Assignment Operators-----------------------");
        x = 20; // equals
        System.out.println(x); // 20
        x += 10; // plus equals
        System.out.println(x); // 30
        x -= 10; // subtract equals
        System.out.println(x); // 20
        x *= 10; // multiply equals
        System.out.println(x); // 200
        x /= 10; // divide equals
        System.out.println(x); // 20
        x %= 10; // modulo equals
        System.out.println(x); // 0
        System.out.println("----------------Comparision Operators----------------");
        x = 10;
        y = 20;
        System.out.println(x == y); // equality check (not for Strings)
        System.out.println(x != y); // inequality check
        System.out.println(x > y); // greater than check
        System.out.println(x < y); // lesser than check
        System.out.println(x >= y); // greater than equals check
        System.out.println(x <= y);// lesser than equals check
    }
}
