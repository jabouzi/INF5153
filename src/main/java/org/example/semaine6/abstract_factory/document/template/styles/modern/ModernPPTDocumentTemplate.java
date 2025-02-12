package org.example.semaine6.abstract_factory.document.template.styles.modern;

import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;

class ModernPPTDocumentTemplate implements PPTDocumentTemplate {
    @Override
    public void renderPPT() {
        System.out.println("Rendering Modern Style PPT Document.");
    }
}
