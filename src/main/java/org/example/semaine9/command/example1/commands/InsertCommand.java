package org.example.semaine9.command.example1.commands;

import org.example.semaine9.command.example1.texteditor.TextEditor;

public class InsertCommand implements Command {
    private final TextEditor textEditor;
    private final String textToInsert;

    public InsertCommand(TextEditor textEditor, String textToInsert) {
        this.textEditor = textEditor;
        this.textToInsert = textToInsert;
    }

    @Override
    public void execute() {
        textEditor.insert(textToInsert);
    }

    @Override
    public void undo() {
        int length = textToInsert.length();
        textEditor.delete(length);
    }
}
