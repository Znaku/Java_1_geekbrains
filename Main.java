package geekbrains.Homework_5;


import java.util.Scanner;



public class Main {

    static Workers workers = new Workers();
    public static Scanner scannerIn = new Scanner(System.in);


    public static void main(String[] args) {

        int taskNumber = -1;
        while (taskNumber != 0) {
            //user interaction
            System.out.println("Enter 1 if you want to add an employee.\nEnter 2 if you want to print all employees older 50 y.o.\nEnter 0 for exit.");
            scannerIn = scannerIn.reset();

            taskNumber = scannerIn.nextInt();

            switch (taskNumber) {
                case 1: {
                    workers.addEmployee();
                    break;
                }
                case 2: {
                    System.out.println("Enter age");
                    workers.printOlderThen(scannerIn.nextInt());
                    break;
                }
                default:
                    System.out.println("Wrong task number!");
                    break;
            }
        }
    }

}
