public class Employee {
    private static int idCounter = 1;


    private int id;
    private String name;
    private int department;
    private int salary;

    public Employee(String name, int department, int salary) {
        id = idCounter;
        idCounter++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Отдел: " + department + ", Зарплата: " + salary;

    }
}
