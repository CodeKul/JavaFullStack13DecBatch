package inheritance;
//Single Inheritance
public class Employee { //super or parent class
    int id = 1;
    String name = "ABC";
    float salary = 60000;
}

class Developer extends Employee{ //child or sub class
    float bonus = 10000;
}

class EmployeeImpl{
    public static void main(String[] args) {
//        Developer developer;//ref.
//        developer = new Developer();
        System.out.println("Developer's Detail");
        Developer developer = new Developer();
        System.out.println(developer.bonus);
        System.out.println(developer.id);
        System.out.println(developer.name);
        System.out.println(developer.salary);
    }
}