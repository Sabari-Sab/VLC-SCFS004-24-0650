package methods.parameters;

public class CallByRef {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println("Before method call is: " + str);
        modifyString(str);
        System.out.println("After method call is: " + str);
    }

    public static void modifyString(StringBuilder val) {
        val.append("World");
        System.out.println("Inside the method the val is: " + val);
    }

    /*
     * * str is a reference type (StringBuilder).
     * When the modifyString() method is called and the str argument is passed,
     * a copy of the reference is made and assigned to the str parameter inside the
     * method.
     * Both the original str variable and the str parameter refer to the same
     * object in memory.
     * Therefore, modifications made to the str parameter (appending ", World!")
     * will also affect the original str variable.
     */
}
