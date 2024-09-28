package methods.staticmethods;

public class Student {
    // instance variables
    int sid;
    String sname;
    float marksInEng;
    float marksInMandrin;
    static String school = "MySchool";

    static void greet() {
        System.out.println("Greetings from " + school);
        // System.out.println("Greetings from " + sname); // not allowed
    }

    void greetInstance() {
        System.out.println("This is a instance methood");
    }

    public static void main(String[] args) {
        greet(); // accessing the static method
        // greetInstance();// not allowed
        Student student = new Student();
        student.greetInstance();
        student.greet();

        // using a static class from the API
        System.out.println(Math.abs(10 - 20));
        System.out.println(Math.round(Math.random() * 100));

    }
}
