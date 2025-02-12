package org.example.semaine6.abstract_factory.document.template.styles.minimalistic;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.styles.DocumentTemplateFactory;

public class MinimalisticStyleDocumentTemplateFactory implements DocumentTemplateFactory {
    @Override
    public HtmlDocumentTemplate createHtmlDocumentTemplate() {
        return new MinimalisticHtmlDocumentTemplate();
    }

    @Override
    public PdfDocumentTemplate createPdfDocumentTemplate() {
        return new MinimalisticPdfDocumentTemplate();
    }

    @Override
    public PPTDocumentTemplate createPPTDocumentTemplate() {
        return new MinimalisticPPTDocumentTemplate();
    }
}
