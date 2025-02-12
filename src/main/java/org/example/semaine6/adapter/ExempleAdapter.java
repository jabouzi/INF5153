package org.example.semaine6.adapter;

import org.example.semaine6.adapter.accounting.dto.IncomeData;

public class ExempleAdapter {
    public static void main(String[] args) {
        IncomeReporter incomeReporter = new IncomeReporter();
        incomeReporter.reportIncome(new IncomeData());
    }
}

/*
Reporting income data in system 1
Reporting income data in system 2
Reporting income data in a legacy system using adapter
Mapping income data to legacy income data
Reporting income data in a legacy system
 */