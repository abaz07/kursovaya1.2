import java.util.Objects;

public class Employee {
    private int department;
    private String name;
    private int salary;
    private static int counter;
    private int id;

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
    //public Employee(String name, int department, int salary) {
    //
    //  }

    public Employee(int department, String name, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
        id = ++counter;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, name, salary, id);
    }
}
