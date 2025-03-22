package org.example.semaine9.template.example1.report;

public abstract class ReportGenerator {
    public void generateReport() {
        openReport();
        createHeader();
        createBody();
        createFooter();
        closeReport();
    }

    private void openReport() {
        System.out.println("Opening report");
    }

    abstract void createHeader();

    abstract void createBody();

    abstract void createFooter();

    private void closeReport() {
        System.out.println("Closing report");
    }
}
