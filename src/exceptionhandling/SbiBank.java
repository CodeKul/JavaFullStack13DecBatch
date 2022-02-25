package exceptionhandling;
//convert this program to menu driven and use scanner class
public class SbiBank {
    private Double amount = 0d;
    void withdrawAmount(Double withdraw){
        if (amount < withdraw){
            try {
                throw new UserDefinedException("Insufficient Balance");
            } catch (UserDefinedException e) {
                e.printStackTrace();
            }
        }else {
            amount = amount - withdraw;
            System.out.println("After withdrawal "+amount);
        }
    }
    void deposit(Double deposit){
        if (deposit > 0){
            amount = amount + deposit;
            System.out.println("After deposit "+amount);
        }
    }
}
class BankImpl{
    public static void main(String[] args) {
        SbiBank sbiBank = new SbiBank();
        sbiBank.deposit(1000d);
        sbiBank.withdrawAmount(5000d);
    }
}