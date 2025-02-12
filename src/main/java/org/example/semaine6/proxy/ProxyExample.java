package org.example.semaine6.proxy;

import org.example.semaine6.proxy.bank.BankAccount;
import org.example.semaine6.proxy.bank.BankAccountImpl;
import org.example.semaine6.proxy.bank.BankAccountSecurityProxy;
import org.example.semaine6.proxy.security.AuthenticationToken;
import org.javamoney.moneta.Money;

import java.util.Set;

import static org.example.semaine6.proxy.security.Authority.*;

public class ProxyExample {
    public static void main(String[] args) {
        AuthenticationToken authenticationToken = new AuthenticationToken("john", Set.of(ALLOWED_DEPOSIT, ALLOWED_GET_BALANCE));

        BankAccount bankAccount = new BankAccountSecurityProxy(
                new BankAccountImpl(),
                authenticationToken
        );

        System.out.println("Depositing money...");
        bankAccount.deposit(Money.of(500, "USD"));
        bankAccount.deposit(Money.of(300, "USD"));

        System.out.println("Getting current balance...");
        Money currentBalance = bankAccount.getBalance();
        System.out.println("Current balance = " + currentBalance);

        System.out.println("Withdrawing money...");
        bankAccount.withdraw(Money.of(100, "USD"));
    }
}

/*
Depositing money...
Getting current balance...
Current balance = USD 800
Withdrawing money...
3 actionable tasks: 3 executed
Feb. 11, 2025 9:07:25 A.M. org.javamoney.moneta.DefaultMonetaryContextFactory createMonetaryContextNonNullConfig
INFO: Using custom MathContext: precision=256, roundingMode=HALF_EVEN
Exception in thread "main" java.lang.IllegalStateException: User is not allowed to withdraw money using token AuthenticationToken[name=john, authorities=[ALLOWED_GET_BALANCE, ALLOWED_DEPOSIT]]
	at org.example.semaine6.proxy.bank.BankAccountSecurityProxy.checkIfAllowedToWithdraw(BankAccountSecurityProxy.java:43)
	at org.example.semaine6.proxy.bank.BankAccountSecurityProxy.withdraw(BankAccountSecurityProxy.java:26)
	at org.example.semaine6.proxy.ProxyExample.main(ProxyExample.java:32)
 */
