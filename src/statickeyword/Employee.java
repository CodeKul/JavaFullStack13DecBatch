package statickeyword;

public class Employee {
    int id;
    String name;
    static String ceo; // get the memory only once

    Employee(){ // when objects gets created
        id = 1;
        name = "Abc";
        System.out.println("in constructor");
    }
    static { // when class is loaded & before creating an object static block
        // executes only once
        ceo = "Yash";
        System.out.println("in static block");
    }
    void show(){
        System.out.println(id +" : "+name+" : "+ceo);
    }
}
class EmployeeImpl {
    public static void main(String[] args) {
        Employee e1 = new Employee();
//        e1.id = 1;
//        e1.name = "Tejas";
//        Employee.ceo = "Yash";

        Employee e2 = new Employee();
//        e2.id = 2;
//        e2.name = "Pallavi";
//        Employee.ceo = "Yash";
//        Employee.ceo = "Shraddha";
        e1.show();
        e2.show();
    }
}
