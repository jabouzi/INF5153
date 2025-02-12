package org.example.semaine6.abstract_factory;

import org.example.semaine6.abstract_factory.document.template.DocumentTemplatesGenerator;
import org.example.semaine6.abstract_factory.document.template.styles.classic.ClassicStyleDocumentTemplateFactory;
import org.example.semaine6.abstract_factory.document.template.styles.minimalistic.MinimalisticStyleDocumentTemplateFactory;
import org.example.semaine6.abstract_factory.document.template.styles.modern.ModernStyleDocumentTemplateFactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        var classicStyleFactory = new ClassicStyleDocumentTemplateFactory();
        var classicTemplatesGenerator = new DocumentTemplatesGenerator(classicStyleFactory);
        classicTemplatesGenerator.renderTemplates();

        var minimalisticStyleFactory = new MinimalisticStyleDocumentTemplateFactory();
        var minimalisticTemplatesGenerator = new DocumentTemplatesGenerator(minimalisticStyleFactory);
        minimalisticTemplatesGenerator.renderTemplates();

        var modernStyleFactory = new ModernStyleDocumentTemplateFactory();
        var modernTemplatesGenerator = new DocumentTemplatesGenerator(modernStyleFactory);
        modernTemplatesGenerator.renderTemplates();
    }
}
