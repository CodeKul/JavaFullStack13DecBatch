package innerclass;
//anonymous class by extending a class
public class Polygon {
    void display(){
        System.out.println("inside Polygon");
    }
}

class PolygonDemo{
    void createAnonymousClass(){
        //creation of anonymous class extending parent class
        Polygon p1 = new Polygon(){
            void display(){
                super.display();
                System.out.println("inside Anonymous class");
            }
        };
        p1.display();
    }
}

class PolygonImpl{
    public static void main(String[] args) {
        PolygonDemo demo = new PolygonDemo();
        demo.createAnonymousClass();
    }
}