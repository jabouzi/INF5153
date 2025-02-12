package org.example.semaine6.abstract_factory.document.template.styles.modern;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.styles.DocumentTemplateFactory;

public class ModernStyleDocumentTemplateFactory implements DocumentTemplateFactory {
    @Override
    public HtmlDocumentTemplate createHtmlDocumentTemplate() {
        return new ModernHtmlDocumentTemplate();
    }

    @Override
    public PdfDocumentTemplate createPdfDocumentTemplate() {
        return new ModernPdfDocumentTemplate();
    }

    @Override
    public PPTDocumentTemplate createPPTDocumentTemplate() {
        return new ModernPPTDocumentTemplate();
    }
}
