package classesandobjects.constructors.thiskeyword;

public class Department {
    int did;
    String dname;

    public Department(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public static void main(String[] args) {
        Department department = new Department(10, "sales");
        Department newDepartment = new Department(11, "IT");

        System.out.println(department.did);
        System.out.println(department.dname);

        System.out.println(newDepartment.did);
        System.out.println(newDepartment.dname);

    }
}

/*
 * this keyword is used to refer to the current object’s instance variables.
 * this() can be used to call another constructor in the same class, enabling
 * constructor chaining.
 * this() must be the first statement in a constructor when calling another
 * constructor.
 */
