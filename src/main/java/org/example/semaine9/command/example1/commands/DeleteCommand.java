package org.example.semaine9.command.example1.commands;

import org.example.semaine9.command.example1.texteditor.TextEditor;

public class DeleteCommand implements Command {
    private final TextEditor textEditor;
    private final int numberOfCharsToDelete;
    private String deletedText;

    public DeleteCommand(TextEditor textEditor, int numberOfCharsToDelete) {
        this.textEditor = textEditor;
        this.numberOfCharsToDelete = numberOfCharsToDelete;
    }

    @Override
    public void execute() {
        deletedText = textEditor.delete(numberOfCharsToDelete);
    }

    @Override
    public void undo() {
        textEditor.insert(deletedText);
    }
}
