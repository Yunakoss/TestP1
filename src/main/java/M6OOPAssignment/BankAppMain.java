package M6OOPAssignment;

public class BankAppMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith",921,"Toronto","11.01.1982");
        Accountant accountant1 = new Accountant("Anna Bold", 323,"Sofia", "20.03.1975");
        Clerk clerk = new Clerk("Kot Semen", 972,"Almaty", "02.12.1980");

        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(clerk.toString());

        manager.fireEmployee("Anna Bold");
        accountant1.createReport();
        clerk.makeCall("Kot Semen");

        accountant1.setName("Mary Petrov");
        System.out.println(accountant1.toString());
    }
}
