package exceptionhandling;

public class UserDefinedException extends Exception{
    UserDefinedException(String message){
        super(message);
    }
}

class TestThrow{
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("User Defined Exception");
        }catch (UserDefinedException e){
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("Remaining code");
    }
}