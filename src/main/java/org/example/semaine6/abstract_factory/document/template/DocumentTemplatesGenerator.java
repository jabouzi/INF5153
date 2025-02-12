package org.example.semaine6.abstract_factory.document.template;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.styles.DocumentTemplateFactory;

public class DocumentTemplatesGenerator {
    private final DocumentTemplateFactory documentTemplateFactory;

    public DocumentTemplatesGenerator(DocumentTemplateFactory documentTemplateFactory) {
        this.documentTemplateFactory = documentTemplateFactory;
    }

    public void renderTemplates() {
        HtmlDocumentTemplate htmlDocumentTemplate = documentTemplateFactory.createHtmlDocumentTemplate();
        PdfDocumentTemplate pdfDocumentTemplate = documentTemplateFactory.createPdfDocumentTemplate();
        PPTDocumentTemplate pptDocumentTemplate = documentTemplateFactory.createPPTDocumentTemplate();

        htmlDocumentTemplate.renderHtml();
        pdfDocumentTemplate.renderPdf();
        pptDocumentTemplate.renderPPT();
    }
}
