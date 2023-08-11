package M6OOPAssignment;

public class Accountant extends Employee{
    public Accountant(String employeeName, int employeeId, String address,  String employeeDateOfBirth) {
        super(employeeName, employeeId, address,
                Constants.ACCOUNTANT_DEFAULT_SALARY, Constants.ACCOUNTANT_TYPE, employeeDateOfBirth);
    }
    public void createReport(){
        System.out.println("Report created");

    }
}
