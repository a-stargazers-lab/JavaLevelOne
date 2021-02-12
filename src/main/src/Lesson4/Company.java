package Lesson4;

public class Company {

    public static void main(String[] args) {

        Employee e = new Employee("Draco Malfoy", "HR-Head", "67389485743", 7000, 25);
        System.out.println(e.getFullName() + " is a " + e.getPosition());

        System.out.println(" ");

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Harry Potter", "Softwareengineer", "56789876", 6000, 45);
        employees[1] = new Employee("Hermione Granger", "HR", "0987623", 3000, 24);
        employees[2] = new Employee("Ronald Weasley", "Project Manager", "09890987", 4000, 30);
        employees[3] = new Employee("Luna Lovegood", "Audit", "123456765", 4000, 41);
        employees[4] = new Employee("Neville Longbottom", "SEO", "344321234", 10000, 28);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40) {
                System.out.println(employees[i].getParticularData());
            }
        }

        System.out.println(" ");
        System.out.println("Employees with new salaries and their new salaries: ");
        changeSalary(employees);

        System.out.println(" ");
        System.out.println("All (new) Data:");
        for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getAllData());
        }
    }

    public static void changeSalary(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 35) {
                array[i].setSalary(array[i].getSalary() + 10000);
                System.out.println(array[i].getParticularData());
            }
        }
    }
}
