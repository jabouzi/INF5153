package org.example.semaine11.replace_implicit_tree_with_composite.apres;

import java.util.ArrayList;
import java.util.List;

// Nœud composite (peut contenir des enfants)
class XMLElement implements XMLNode {
    private String tag;
    private List<XMLNode> children = new ArrayList<>();

    public XMLElement(String tag) {
        this.tag = tag;
    }

    public XMLElement add(XMLNode node) {
        children.add(node);
        return this;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tag).append(">");
        children.forEach(child -> sb.append(child.render()));
        sb.append("</").append(tag).append(">");
        return sb.toString();
    }
}
