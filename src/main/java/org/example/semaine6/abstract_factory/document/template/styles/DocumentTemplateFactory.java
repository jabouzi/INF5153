package org.example.semaine6.abstract_factory.document.template.styles;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;
import org.example.semaine6.abstract_factory.document.template.formats.PdfDocumentTemplate;

public interface DocumentTemplateFactory {
    HtmlDocumentTemplate createHtmlDocumentTemplate();

    PdfDocumentTemplate createPdfDocumentTemplate();

    PPTDocumentTemplate createPPTDocumentTemplate();
}
