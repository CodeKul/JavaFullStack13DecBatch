package encapsulation;

public class Account {
    private int accountNo;
    private String name;
    private String email;
    private double amount;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class AccountImpl{
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNo(65465465);
        account.setAmount(5000);
        account.setEmail("codekul@gmail.com");
        account.setName("codekul");
        System.out.println("Account No : "+account.getAccountNo());
        System.out.println("Name : "+account.getName());
        System.out.println("EMail : "+account.getEmail());
        System.out.println("Amount : "+account.getAmount());


    }
}
