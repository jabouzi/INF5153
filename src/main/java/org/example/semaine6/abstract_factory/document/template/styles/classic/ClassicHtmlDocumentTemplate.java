package org.example.semaine6.abstract_factory.document.template.styles.classic;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;

class ClassicHtmlDocumentTemplate implements HtmlDocumentTemplate {
    @Override
    public void renderHtml() {
        System.out.println("Rendering Classic Style HTML Document.");
    }
}
