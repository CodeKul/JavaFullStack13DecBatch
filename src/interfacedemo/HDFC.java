package interfacedemo;

public class HDFC implements Bank{
    @Override
    public double sanctionLoan() {
        return 10;
    }

    @Override
    public void print() {
        System.out.println("in HDFC");
    }
}
class SBI implements Bank{
    @Override
    public double sanctionLoan() {
        return 8;
    }

    @Override
    public void print() {
        System.out.println("In SBI");
    }
}
class BankImpl{
    public static void main(String[] args) {
        Bank b = new HDFC();
        System.out.println("Approved Loan "+b.sanctionLoan());
        b.print();
        Bank b1 = new SBI();
        System.out.println("Approved Loan "+b1.sanctionLoan());
        b1.print();

    }
}