package thiskeyword;

/**
 * this :
 *  - reference variable that refers to current object
 *  Usage -:
 *  1. used to refer current class instance variable
 *  2. used to invoke current class method
 *  3. used to invoke current class constructor
 *
 *  Note :
 *  this() must be first statement in constructor
 */
public class Person {
    int pid; //instance variable
    String name;//instance variable

    void setPid(int pid){ //local variable
        this.pid = pid;
    }
    void setName(String name){
        this.name = name;
    }
    void show(){
        System.out.println("PID "+pid);
        System.out.println("PName "+name);
    }
}
class PersonImpl{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setPid(10);
        p1.show();
        Person p2 = new Person();
        p2.setName("ABC");
        p2.setPid(15);
        p2.show();
    }
}
