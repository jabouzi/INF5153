package org.example.semaine6.abstract_factory.document.template.styles.modern;

import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;

class ModernPdfDocumentTemplate implements PdfDocumentTemplate {
    @Override
    public void renderPdf() {
        System.out.println("Rendering Modern Style Pdf Document.");
    }
}
