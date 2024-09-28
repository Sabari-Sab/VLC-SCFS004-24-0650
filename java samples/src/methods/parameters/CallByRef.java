package methods.parameters;

public class CallByRef {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        ;
        System.out.println("Before method call is: " + str);
        modifyString(str);
        System.out.println("After method call is: " + str);
    }

    public static void modifyString(StringBuilder val) {
        val.append("World");
        System.out.println("Inside the method the val is: " + val);
    }
}
