public class Main {
    static Employee[] staff = new Employee[10];


    public static void main(String[] args) {

        staff[0] = new Employee("Иванов Иван", 1, 50000);
        staff[1] = new Employee("Петров Петр", 2, 60000);
        staff[2] = new Employee("Сидоров Сидор", 3, 55000);
        staff[3] = new Employee("Кузнецова Анна", 1, 70000);
        staff[4] = new Employee("Морозов Алексей", 5, 40000);
        staff[5] = new Employee("Смирнова Елена", 2, 80000);
        staff[6] = new Employee("Новикова Мария", 4, 45000);
        staff[7] = new Employee("Федоров Николай", 3, 65000);
        staff[8] = new Employee("Алексеева Ирина", 5, 58000);
        staff[9] = new Employee("Ковалев Артем", 1, 47000);

        printAll();

        System.out.println("Общая зарплата: " + totalSalary());
        System.out.println("Средняя зарплата: " + averageSalary());
        System.out.println("Минимальная зарплата у: " + minSalary().getName());
        System.out.println("Максимальная зарплата у: " + maxSalary().getName());

        printNames();
    }

    static void printAll() {
        for (Employee e : staff) {
            System.out.println(e);
        }
    }

    static int totalSalary() {
        int sum = 0;
        for (Employee e : staff) {
            sum += e.getSalary();
        }
        return sum;
    }

    static int averageSalary() {
        return totalSalary() / staff.length;
    }

    static Employee minSalary() {
        Employee min = staff[0];
        for (Employee e : staff) {
            if (e.getSalary() < min.getSalary()) {
                min = e;
            }
        }
        return min;
    }

    static Employee maxSalary() {
        Employee max = staff[0];
        for (Employee e : staff) {
            if (e.getSalary() > max.getSalary()) {
                max = e;
            }
        }
        return max;
    }

    static void printNames() {
        System.out.println("Имена сотрудников:");
        for (Employee e : staff) {
            System.out.println(e.getName());
        }
    }
}
