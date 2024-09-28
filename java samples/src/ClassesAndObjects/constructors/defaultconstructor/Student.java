package classesandobjects.constructors.defaultconstructor;

public class Student {
    int sid = 10; // all isntances now will have 10 as a value for sid
    String sname = "NoName";
    float marks = 10;

    public Student() {
        System.out.println("The default constructor called");
    }

    // public Student(int sid, String sname, float marks) {
    // this.sid = sid;
    // this.sname = sname;
    // this.marks = marks;
    // }

    public static void main(String[] args) {
        // using the default constructor to create an object
        Student s = new Student();
        System.out.println(s.sid); // 0
        System.out.println(s.sname); // null
        System.out.println(s.marks); // 0.0

        Student s1 = new Student();
        System.out.println(s1.sid); // 0
        System.out.println(s1.sname); // null
        System.out.println(s1.marks); // 0.0
    }
}

/*
 * Default Constructor
 * 1. same name as the class
 * 2. No Arguments
 * 3. Assigns default values (Based on the type) to all attributes
 * 4. The default constructor is not be implicitly available if a overloaded
 * constructor is specified
 */
