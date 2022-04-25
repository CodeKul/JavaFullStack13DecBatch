package multithreading;

import java.util.Scanner;

class Bank{
    Double totalAmount = 10000d;
    synchronized  void withdrawMoney(Double amount){
        if (totalAmount >= amount){
            totalAmount = totalAmount - amount;
            System.out.println("After withdrawal "+totalAmount);
        }else {
            System.out.println("You have insufficient balance");
        }
    }
    synchronized void depositMoney(double amount){
        if (amount > 0){
            totalAmount = totalAmount + amount;
            System.out.println("Amount after deposit "+totalAmount);
        }
    }
}

class UserThread1 extends Thread{
    Bank bank;
    Double amount;
    UserThread1(Bank bank,Double amount){
        this.bank = bank;
        this.amount = amount;
    }
    @Override
    public void run() {
        bank.withdrawMoney(amount);
    }
}

class UserThread2 extends Thread{
    Bank bank;
    Double amount;
    UserThread2(Bank bank,Double amount){
        this.bank = bank;
        this.amount = amount;
    }
    @Override
    public void run() {
        bank.depositMoney(amount);
    }
}

public class BankTransactionImpl {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for withdraw the money");
        UserThread1 thread1 = new UserThread1(bank, sc.nextDouble());

        System.out.println("Enter amount for deposit the money");
        UserThread2 thread2 = new UserThread2(bank,sc.nextDouble());
        thread1.start();
        thread2.start();
    }
}
