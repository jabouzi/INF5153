package org.example.semaine5.uml.old.realization;

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
