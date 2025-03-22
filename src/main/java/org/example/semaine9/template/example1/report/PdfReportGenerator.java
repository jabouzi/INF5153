package org.example.semaine9.template.example1.report;

public class PdfReportGenerator extends ReportGenerator {
    @Override
    void createHeader() {
        System.out.println("Creating Pdf Header");
    }

    @Override
    void createBody() {
        System.out.println("Creating Pdf Body");
    }

    @Override
    void createFooter() {
        System.out.println("Creating Pdf Footer");
    }
}
