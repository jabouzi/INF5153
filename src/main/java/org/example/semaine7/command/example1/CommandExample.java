package org.example.semaine7.command.example1;

import org.example.semaine7.command.example1.commands.DeleteCommand;
import org.example.semaine7.command.example1.commands.InsertCommand;
import org.example.semaine7.command.example1.texteditor.TextEditor;
import org.example.semaine7.command.example1.texteditor.TextEditorCommandInvoker;

public class CommandExample {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorCommandInvoker textEditorCommandInvoker = new TextEditorCommandInvoker();

        textEditorCommandInvoker.executeCommand(new InsertCommand(textEditor, "Hello, World!"));
        System.out.println(textEditor.getText());

        textEditorCommandInvoker.executeCommand(new DeleteCommand(textEditor, 6));
        System.out.println(textEditor.getText());

        textEditorCommandInvoker.undo();
        System.out.println(textEditor.getText());

        textEditorCommandInvoker.redo();
        System.out.println(textEditor.getText());
    }
}
