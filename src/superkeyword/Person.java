package superkeyword;

public class Person {
    int id;
    String name;
    String mobileNo;

    public Person(int id, String name,String mobileNo) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
    }
}
class Employee extends Person{
    float salary;

    Employee(int id,String name,String mobileNo,float salary){
        super(id,name,mobileNo);
        this.salary = salary;
    }
    void display(){
        System.out.println(super.id +" "+super.name+" "+salary + " "+mobileNo);
    }
}
class PersonImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"John","85951651651",55000);
        e1.display();
    }
}
