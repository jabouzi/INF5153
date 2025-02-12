package org.example.semaine6.flyweight.text.component;

import org.example.semaine6.flyweight.text.font.Font;
import org.example.semaine6.flyweight.text.font.FontFactory;
public class TextLabel {
    private static final FontFactory FONT_FACTORY = new FontFactory();

    private final Font font;
    private final String text;

    public TextLabel(String fontName, String text) {
        this.font = FONT_FACTORY.getFont(fontName);
        this.text = text;
    }

    public void render() {
        font.render(text);
    }
}
