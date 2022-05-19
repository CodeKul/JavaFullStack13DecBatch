package java8;
interface MessageAlert{
    void getMessage(String msg);
}
public class Message {
   Message(String msg){
       System.out.println(msg);
   }
}

class MessageConstructorReferenceDemo{
    public static void main(String[] args) {
        //Message message = new Message();
       MessageAlert messageAlert=  Message::new;
       messageAlert.getMessage("Im default constructor");
    }
}