package oop.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
        System.out.println("현재 잔액: " + balance);
    }

    void withdraw(int amount){
        if(amount>balance)
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance);
        else
            balance -= amount;
    }
}
