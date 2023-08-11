package M6OOPAssignment;

public abstract class Employee {
    private String name;
    private int id;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
    private double salary;
    private String position;
    private String dateOfBirth;

    public Employee(String employeeName, int employeeId, String address, double employeeSalary, String employeePosition, String employeeDateOfBirth){
        this.name = employeeName;
        this.id = employeeId;
        this.address = address;
        this.salary = employeeSalary;
        this.position = employeePosition;
        this.dateOfBirth = employeeDateOfBirth;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

public void receiveSalary(){
    System.out.println("The salary was sent to the employee bank account");
}
public String toString(){
        String txt = String.format("Employee name: %s, position: %s, address: %s, salary: %f", name, position, salary);
        return txt;
}
}
