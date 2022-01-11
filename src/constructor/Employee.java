package constructor;
//Parameterised constructor
public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee e){
        id = e.id;
        name = e.name;
        salary = e.salary;
    }

    void  display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee employee = new Employee(121,"abc",50000);
        employee.display();
        Employee employee1 = new Employee(122,"xyz",55000);
        employee1.display();
        Employee employee2 = new Employee(123,"pqr");
        employee2.display();
        Employee employee3 = new Employee(employee1);
        employee3.display();
    }
}

