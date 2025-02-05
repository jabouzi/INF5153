package org.example.semaine5.patrons.fabrique;

import java.util.Calendar;

public class FactoryEveryDayDemo {
    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
