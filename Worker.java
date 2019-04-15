package geekbrains.Homework_5;

public class Worker {

    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int age;
    public double salary;

    public Worker(String fullName, String position, String email, String phoneNumber, int age, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public Worker() {

    }

    public void printInfo() {
        System.out.println("Name----------" + fullName);
        System.out.println("Position------" + position);
        System.out.println("email---------" + email);
        System.out.println("Phone number--" + phoneNumber);
        System.out.println("Age-----------" + age);
        System.out.println("Salary--------" + salary);
    }

}
