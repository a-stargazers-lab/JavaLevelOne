package Lesson4;

public class Employee {

    /**
     * 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст; +
     * 2 Конструктор класса должен заполнять эти поля при создании объекта; +
     * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля; +
     * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
     * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
     * 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
     * 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
     */


    private String fullName;
    private String position;
    private String telNr;
    private int salary;
    private int age;
    private int idNumber;

    private static int id = 0;

    public Employee(String fullName, String position, String telNr, int salary, int age) {

        this.fullName = fullName;
        this.position = position;
        this.telNr = telNr;
        this.salary = salary;
        this.age = age;
        this.idNumber = ++id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  /*  public int getId() {
        return this.id;
    }

    public void setId() {
        this.id = id++;
    }*/


    public String getParticularData() {
        return "The " + this.idNumber + " employee " + this.getFullName() +
                " is working in our company as a/an " + this.getPosition() +
                " with a salary of " + this.getSalary() + " US Dollar";
        // + this.getAge() + getTelNr()
    }

    public String getAllData(){
        return "The " + this.idNumber + " employee " + this.getFullName() +
                " is working in our company as a/an " + this.getPosition() +
                " with a salary of " + this.getSalary() + " US Dollar." +
                " Age: " + this.getAge() + " Tel.Nr.: " + getTelNr();
    }

}





