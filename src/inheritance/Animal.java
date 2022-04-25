package inheritance;
//Multilevel
public class Animal {
    void sound(){
        System.out.println("sound....");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("eating....");
    }
}
class BabyCat extends Cat{
    void run(){
        System.out.println("running....");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat();
        babyCat.run();
        babyCat.eat();
        babyCat.sound();
    }
}
