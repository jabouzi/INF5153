package org.example.semaine6.adapter;

import org.example.semaine6.adapter.accounting.AccountingSystem;
import org.example.semaine6.adapter.accounting.AccountingSystem1;
import org.example.semaine6.adapter.accounting.AccountingSystem2;
import org.example.semaine6.adapter.accounting.LegacyAccountingSystemAdapter;
import org.example.semaine6.adapter.accounting.dto.IncomeData;
import org.example.semaine6.adapter.accounting.legacy.LegacyAccountingSystemImpl;

public class IncomeReporter {
    private final AccountingSystem accountingSystem1 = new AccountingSystem1();
    private final AccountingSystem accountingSystem2 = new AccountingSystem2();
    private final AccountingSystem accountingSystem3 = new LegacyAccountingSystemAdapter(
            new LegacyAccountingSystemImpl()
    );

    public void reportIncome(IncomeData incomeData) {
        accountingSystem1.reportIncome(incomeData);
        accountingSystem2.reportIncome(incomeData);
        accountingSystem3.reportIncome(incomeData);
    }
}

