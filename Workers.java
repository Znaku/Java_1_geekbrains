package geekbrains.Homework_5;

import java.util.ArrayList;

public class Workers {

    private ArrayList<Worker> workersList;

    public Workers() {

        workersList = new ArrayList<Worker>();

    }


    public void add(Worker worker) {

        workersList.add(worker);

    }

    public void printOlderThen(int maxAge) {

        for (int i = 0; i < this.workersList.size(); i++) {
            Worker currWorker = this.workersList.get(i);

            if (currWorker.age > maxAge) System.out.println(currWorker.fullName);
        }

    }

    public void addEmployee() {

        Main.scannerIn.nextLine();

        Worker newWorker = new Worker();

        System.out.println("Enter full name");
        newWorker.fullName = Main.scannerIn.nextLine();

        System.out.println("Enter position");
        newWorker.position = Main.scannerIn.nextLine();

        System.out.println("Enter email");
        newWorker.email = Main.scannerIn.nextLine();

        System.out.println("Enter phone number");
        newWorker.phoneNumber = Main.scannerIn.nextLine();

        System.out.println("Enter age");
        newWorker.age = Main.scannerIn.nextInt();

        System.out.println("Enter salary");
        newWorker.salary = Main.scannerIn.nextInt();

        add(newWorker);

    }


}
