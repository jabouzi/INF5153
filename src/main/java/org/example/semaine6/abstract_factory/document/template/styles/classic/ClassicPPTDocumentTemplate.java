package org.example.semaine6.abstract_factory.document.template.styles.classic;

import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;

class ClassicPPTDocumentTemplate implements PPTDocumentTemplate {
    @Override
    public void renderPPT() {
        System.out.println("Rendering Classic Style PPT Document.");
    }
}
