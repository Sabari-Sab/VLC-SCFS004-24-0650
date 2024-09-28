package classesandobjects.constructors.chaining;

public class Person {
    int pid;
    String pname;

    public Person() {
        this(100, "Thomas"); // invoking another constructor
        System.out.println("The default constructor invoked");
    }

    public Person(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    void display() {
        System.out.println("Person ID: " + this.pid);
        System.out.println("Person Name: " + this.pname);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }

}

// this() can be used to call another constructor in the same class, enabling
// constructor chaining.
// this() must be the first statement in a constructor when calling another
// constructor.