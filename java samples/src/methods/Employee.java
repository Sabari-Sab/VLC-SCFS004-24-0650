package methods;

public class Employee {
    String name;
    float sal;

    void createEmployee() {
        Employee e = new Employee();
        e.name = "Alex";
        e.sal = 1000f;

        // display the emp record
        System.out.println(e.name + " - " + annualSal(e));
    }

    float annualSal(Employee emp) {
        return emp.sal * 12;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.createEmployee();
    }
}
