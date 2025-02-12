package org.example.semaine6.abstract_factory.document.template.styles.modern;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;

class ModernHtmlDocumentTemplate implements HtmlDocumentTemplate {
    @Override
    public void renderHtml() {
        System.out.println("Rendering Modern Style HTML Document.");
    }
}
