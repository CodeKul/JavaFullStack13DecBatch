package innerclass;

//anonymous class by implementing an interface
public interface Polygon1 {
    void display();
}
class PolygonDemo1{
    void createAnonymousClass(){
       Polygon1 p1 = new Polygon1() {
           @Override
           public void display() {
               System.out.println("inside Anonymous ");
           }
       };
        p1.display();
    }
}
class PolygonImpl1 {
    public static void main(String[] args) {
        PolygonDemo1 polygonDemo1 = new PolygonDemo1();
        polygonDemo1.createAnonymousClass();
    }
}