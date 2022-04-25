package accessmodifiers;

public class Modifiers {
    private int no = 52;
    private Modifiers(){
    }
    private void getMsg(){
        System.out.println("private access");
    }
}
class ModifiersImpl{
    public static void main(String[] args) {
       // Modifiers modifiers = new Modifiers(); ////compile time
        //modifiers.no; //compile time
        //modifiers.getMsg(); //compile time
    }
}
