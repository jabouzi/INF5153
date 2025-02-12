package org.example.semaine6.abstract_factory.document.template.styles.minimalistic;

import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;

class MinimalisticPdfDocumentTemplate implements PdfDocumentTemplate {
    @Override
    public void renderPdf() {
        System.out.println("Rendering Minimalistic Style Pdf Document.");
    }
}
