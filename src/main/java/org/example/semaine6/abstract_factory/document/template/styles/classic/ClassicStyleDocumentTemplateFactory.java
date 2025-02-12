package org.example.semaine6.abstract_factory.document.template.styles.classic;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.styles.DocumentTemplateFactory;

public class ClassicStyleDocumentTemplateFactory implements DocumentTemplateFactory {
    @Override
    public HtmlDocumentTemplate createHtmlDocumentTemplate() {
        return new ClassicHtmlDocumentTemplate();
    }

    @Override
    public PdfDocumentTemplate createPdfDocumentTemplate() {
        return new ClassicPdfDocumentTemplate();
    }

    @Override
    public PPTDocumentTemplate createPPTDocumentTemplate() {
        return new ClassicPPTDocumentTemplate();
    }
}
