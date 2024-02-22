package oop1.ex;

public class Account {

    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액부족");
        } else {
            balance -= amount;
        }
    }
}
