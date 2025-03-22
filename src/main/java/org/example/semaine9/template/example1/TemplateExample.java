package org.example.semaine9.template.example1;

import org.example.semaine9.template.example1.report.HtmlReportGenerator;
import org.example.semaine9.template.example1.report.PdfReportGenerator;
import org.example.semaine9.template.example1.report.ReportGenerator;
import org.example.semaine9.template.example1.report.TxtReportGenerator;

class TemplateExample {
    public static void main(String[] args) {
        ReportGenerator htmlReportGenerator = new HtmlReportGenerator();
        htmlReportGenerator.generateReport();

        ReportGenerator pdfReportGenerator = new PdfReportGenerator();
        pdfReportGenerator.generateReport();

        ReportGenerator txtReportGenerator = new TxtReportGenerator();
        txtReportGenerator.generateReport();
    }
}
