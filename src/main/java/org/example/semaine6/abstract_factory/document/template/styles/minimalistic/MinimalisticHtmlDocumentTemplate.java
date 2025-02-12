package org.example.semaine6.abstract_factory.document.template.styles.minimalistic;

import org.example.semaine6.abstract_factory.document.template.formats.HtmlDocumentTemplate;

class MinimalisticHtmlDocumentTemplate implements HtmlDocumentTemplate {
    @Override
    public void renderHtml() {
        System.out.println("Rendering Minimalistic Style HTML Document.");
    }
}
