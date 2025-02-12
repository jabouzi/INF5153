package org.example.semaine6.adapter.accounting;


import org.example.semaine6.adapter.accounting.dto.IncomeData;
import org.example.semaine6.adapter.accounting.legacy.LegacyAccountingSystem;
import org.example.semaine6.adapter.accounting.legacy.dto.LegacyIncomeData;

public class LegacyAccountingSystemAdapter implements AccountingSystem {

    private final LegacyAccountingSystem legacyAccountingSystem;

    public LegacyAccountingSystemAdapter(LegacyAccountingSystem legacyAccountingSystem) {
        this.legacyAccountingSystem = legacyAccountingSystem;
    }

    @Override
    public void reportIncome(IncomeData incomeData) {
        // Adapter that can map regular AccountingSystem request to LegacyAccountingSystem request
        System.out.println("Reporting income data in a legacy system using adapter");
        legacyAccountingSystem.reportLegacyIncome(mapToLegacyIncomeData(incomeData));
    }

    private LegacyIncomeData mapToLegacyIncomeData(IncomeData incomeData) {
        // implementation of data mapping between income data and legacy income data
        System.out.println("Mapping income data to legacy income data");
        return new LegacyIncomeData();
    }
}
