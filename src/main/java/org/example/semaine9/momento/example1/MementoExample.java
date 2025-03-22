package org.example.semaine9.momento.example1;


import org.example.semaine9.momento.example1.editor.TextEditor;
import org.example.semaine9.momento.example1.history.History;

public class MementoExample {
    public static void main(String[] args) {
        var history = new History();
        TextEditor editor = new TextEditor();

        editor.insert("Hello World!");
        editor.insert(" Hello Again!");
        System.out.println(editor.getText()); // Hello World! Hello Again!
        history.add(editor.getCurrentState());

        editor.delete(6);
        System.out.println(editor.getText()); // Hello World! Hello
        history.add(editor.getCurrentState());

        editor.insert("John!");
        System.out.println(editor.getText()); // Hello World! Hello John!
        history.add(editor.getCurrentState());

        editor.delete(1);
        editor.insert(" & Mark!");
        System.out.println(editor.getText());
        history.add(editor.getCurrentState());
        history.undo();
        history.undo();
        history.undo();
        history.undo();
        System.out.println(editor.getText()); // Hello World! Hello Again!

        history.redo();
        history.redo();
        history.redo();
        history.redo();
        System.out.println(editor.getText()); // Hello World! Hello John & Mark!
    }
}
