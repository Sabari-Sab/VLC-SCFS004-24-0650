package methods.parameters;

public class CallByValue {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call is: " + num);
        modifyValue(num);
        System.out.println("After method call is: " + num);
    }

    public static void modifyValue(int val) {
        val = 20;
        System.out.println("Inside the method the val is: " + val);
    }

    /*
     * val is of a primitive type
     * when the modifyValue() is called and a value is passed,
     * a copy of the value is made available to to the parameter.
     * Any changes to the parameter will not affect the value of the original
     * variable
     */

}
