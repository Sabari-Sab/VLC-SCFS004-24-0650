package classesandobjects.constructors;

public class Employee {
    int empid;
    String ename;
    float sal;

    public Employee() { // it creates an instance with default values for fields
    }

    // fully loaded constructor or also all args constructor
    public Employee(int empid, String ename, float sal) {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
    }

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public Employee(String ename, int empid) {
        this.empid = empid;
        this.ename = ename;
    }

    public Employee(int empid) {
        this.empid = empid;
    }

    public static void main(String[] args) {
        // using the default constructor
        Employee employee = new Employee(); // new Employee() invokes a constructor
        System.out.println(employee.empid); // 0
        System.out.println(employee.ename); // null
        System.out.println(employee.sal); // 0.0
        employee.empid = 100;
        employee.ename = "Alex";
        employee.sal = 998.99f;
        System.out.println(employee.empid); // 100
        System.out.println(employee.ename); // Alex
        System.out.println(employee.sal); // 998.99

        // using the overloaded constructor
        Employee emp = new Employee(101, "David", 999.8f);
        System.out.println(emp.empid + "- " + emp.ename + " - " + emp.sal);
        Employee emp1 = new Employee(102, "Jane");
        System.out.println(emp1.empid + "- " + emp1.ename + " - " + emp1.sal);
        Employee emp11 = new Employee("Jane", 104);
        System.out.println(emp1.empid + "- " + emp1.ename + " - " + emp1.sal);
        Employee emp2 = new Employee(102);
        System.out.println(emp2.empid + "- " + emp2.ename + " - " + emp2.sal);

    }

}

/*
 * a constructor is a special type of a method
 * 1. does not have a return type
 * 2. The name of a constructor is always the same as class name
 * 3. can be overloaded
 * 4. Every class has a implicit constructor called default constructor
 * 5. Constructor is used to assign values to the instance fields
 * 
 * Default Constructor
 * 1. same name as the class
 * 2. No Arguments
 * 3. Assigns default values (Based on the type) to all attributes
 */