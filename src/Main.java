public class Main {
    public static Employee createEmployee(String name, int department, int salary) {
        Employee employee = new Employee(department, name, salary);
        return employee;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = createEmployee("Andreev Andrey Andreevich", 1, 56000);
        employees[1] = createEmployee("Andreev Viktor Andreevich", 2, 23000);
        employees[2] = createEmployee("Andreev Roman Andreevich", 3, 44000);
        employees[3] = createEmployee("Andreev Kirill Andreevich", 4, 77000);
        employees[4] = createEmployee("Andreev Phil Andreevich", 5, 123000);
        employees[5] = createEmployee("Andreeva Ekaterina Andreevna", 1, 1000);
        employees[6] = createEmployee("Andreeva Oksana Andreevna", 2, 226000);
        employees[7] = createEmployee("Andreeva Violetta Andreevna", 4, 65000);
        employees[8] = createEmployee("Andreev Vitaly Andreevich", 3, 55000);
        employees[9] = createEmployee("Andreeva Svetlana Andreevna", 5, 77000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        int result = calculateSalary(employees);
        System.out.println("Общая сумма затрат на зарплату " + result);
        int minSalary = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < minSalary) {
                minIndex = i;
                minSalary = employee.getSalary();
            }
        }
        if (minIndex == -1) {
            System.out.println("Не нашли сотрудника с минимальной зарплатой");
        } else {
            System.out.println("Сотрудник с минимальной ЗП " + employees[minIndex]);
        }
        int maxSalary = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() > maxSalary) {
                maxIndex = i;
                maxSalary = employee.getSalary();
            }
        }
        if (maxIndex == -1) {
            System.out.println("Не нашли сотрудника с максимальной зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной ЗП " + employees[maxIndex]);
        }
        int resultSalary = calculateSalary(employees);
        double average = (double) resultSalary / Employee.getCounter();
        System.out.println("Средняя зарплата сотрудников " + average);
        printEmployeeFullNames(employees);
    }

    private static void printEmployeeFullNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                System.out.println("ФИО сотрудников " + employee.getName());
            }
        }
    }

    private static int calculateSalary(Employee[] employees) {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                result = result + employee.getSalary();
            }
        }
        return result;
    }
}
