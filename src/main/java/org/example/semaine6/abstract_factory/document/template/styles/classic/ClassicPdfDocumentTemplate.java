package org.example.semaine6.abstract_factory.document.template.styles.classic;

import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;

class ClassicPdfDocumentTemplate implements PdfDocumentTemplate {
    @Override
    public void renderPdf() {
        System.out.println("Rendering Classic Style Pdf Document.");
    }
}
