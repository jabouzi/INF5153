package org.example.semaine6.adapter.accounting;


import org.example.semaine6.adapter.accounting.dto.IncomeData;

public class AccountingSystem1 implements AccountingSystem {
    @Override
    public void reportIncome(IncomeData incomeData) {
        // Income data reporting details in system 1
        System.out.println("Reporting income data in system 1");
    }
}
