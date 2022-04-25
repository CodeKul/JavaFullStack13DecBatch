package polymorphism.methodoverriding;
//Method Override
public class Animal {
    void move(){
        System.out.println("moving...");
    }
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void move(){
        System.out.println("Dog is moving...");
    }

    void eat(){
        System.out.println("Dog is eating...");
    }
}

class AnimalImpl{
    public static void main(String[] args) {
        Animal animal; //reference variable
        animal = new Dog();

       // Animal animal1 = new Dog(); //parent type reference refers to a child object (Run Time Polymorphism)
        animal.move();
        animal.eat();
    }
}