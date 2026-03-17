package Lesson3;

public class Employee {
    private String name;
    private String surname;
    private String dolgnost;
    private String email;
    private String telephoneNumber;
    private double salary;
    public int age;

    public Employee(String name, String surname, String dolgnost, String email, String telephoneNumber, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.dolgnost = dolgnost;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dolgnost='" + dolgnost + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "Ivanov", "nachalnik", "email1@email.com", "1512-132132", 132540,42);
        employees[1] = new Employee("Petr", "Petrov", "manager", "email2@email.com", "151-32", 110540,39);
        employees[2] = new Employee("Maria", "Ivanova", "manager", "email3@email.com", "1512-12132", 120540,40);
        employees[3] = new Employee("Sveta", "Petrova", "manager", "email4@email.com", "1512-1332", 130540,25);
        employees[4] = new Employee("Snegana", "Ivanova", "manager", "email5@email.com", "1512-132", 110540,22);
        for (int i = 0; i < 5; i++) {
            if(employees[i].age > 40) {
                System.out.println(employees[i].toString());
            }

        }
    }
}
