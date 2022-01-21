package superkeyword;

/**
 * 3. used to invoke parent class constructor
 */
public class Animal {
    Animal(){
        System.out.println("In Animal class");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("In Dog class");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
