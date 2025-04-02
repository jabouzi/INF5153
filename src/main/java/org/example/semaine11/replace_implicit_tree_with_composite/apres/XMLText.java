package org.example.semaine11.replace_implicit_tree_with_composite.apres;

// Nœud texte (contenu simple)
class XMLText implements XMLNode {
    private String content;

    public XMLText(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return content;
    }
}
