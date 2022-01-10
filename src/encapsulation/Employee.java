package encapsulation;

public class Employee {
    private int id;
    private String name;
    private double salary; //write only
    private double bonus ; //read only //total salary
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return 5000;
    }

    double calculateSalary(){
        double totalSalary = salary + getBonus();
        return totalSalary;
    }
    public void display(){
        System.out.println("ID: "+getId());
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Total Salary: "+calculateSalary());
    }
}

class EmployeeImpl {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmail("abc@codekul.com");
        employee.setName("abc");
        employee.setSalary(50000);
        employee.display();
    }
}