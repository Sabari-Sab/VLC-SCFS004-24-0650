package methods;

public class MethodDemo {
    // Syntax
    // <access_Modifier> [static] <return_Type> <Method_name>[(parameters)]

    // instance method
    // return type void indicates that the method has no return value
    void sayHello() {
        System.out.println("In the sayHello method");
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        MethodDemo m = new MethodDemo();
        m.sayHello();
        System.out.println("The instance method is done executing");
    }

}
