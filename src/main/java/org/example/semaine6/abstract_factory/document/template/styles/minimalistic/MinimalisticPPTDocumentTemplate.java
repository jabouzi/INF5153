package org.example.semaine6.abstract_factory.document.template.styles.minimalistic;

import org.example.semaine6.abstract_factory.document.template.formats.PPTDocumentTemplate;

class MinimalisticPPTDocumentTemplate implements PPTDocumentTemplate {
    @Override
    public void renderPPT() {
        System.out.println("Rendering Minimalistic Style PPT Document.");
    }
}
