package org.example.semaine6.proxy.bank;


import org.javamoney.moneta.Money;

public interface BankAccount {
    void deposit(Money amount);

    void withdraw(Money amount);

    Money getBalance();
}
