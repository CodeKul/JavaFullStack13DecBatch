package interfacedemo;
//Custom Marker Interface example
public interface Animal {
}

interface BodyColor{
}
class Dog implements Animal{
    static void isAnimal(){
        System.out.println("Dog is Animal");
    }
}

class Cat{
    static void isAnimal(){
        System.out.println("Cat is Animal");
    }
}
class Color implements BodyColor{
   static void isBlack(){
        System.out.println("Dog is in black color");
    }
}

class CustomMarkerInterfaceDemo{
    public static void main(String[] args) {
        Dog.isAnimal();
        Color.isBlack();
        Cat cat = new Cat();
        if (cat instanceof Animal){
            System.out.println("Cat is instance of Animal");
        }else {
            System.out.println("Cat is not instance of Animal");
        }
        Dog dog = new Dog();

        if (dog instanceof Animal){
            System.out.println("Dog is instance of Animal");
        }else {
            System.out.println("Dog is not instance of Animal");
        }
    }
}