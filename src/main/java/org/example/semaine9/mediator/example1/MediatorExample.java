package org.example.semaine9.mediator.example1;


import org.example.semaine9.mediator.example1.components.SubmissionsList;
import org.example.semaine9.mediator.example1.components.SubmitButton;
import org.example.semaine9.mediator.example1.components.TextField;
import org.example.semaine9.mediator.example1.dialog.Dialog;
import org.example.semaine9.mediator.example1.dialog.Mediator;

public class MediatorExample {
    public static void main(String[] args) {
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField emailField = new TextField();
        SubmitButton submitButton = new SubmitButton();
        SubmissionsList submissionsList = new SubmissionsList();

        Mediator dialog = new Dialog(firstNameField, lastNameField, emailField, submitButton, submissionsList);

        firstNameField.setMediator(dialog);
        lastNameField.setMediator(dialog);
        emailField.setMediator(dialog);
        submitButton.setMediator(dialog);
        submissionsList.setMediator(dialog);

        System.out.println("Submit button is enabled = " + submitButton.isEnabled());
        System.out.println("Submissions list size = " + submissionsList.size());

        firstNameField.setValue("John");
        lastNameField.setValue("Doe");
        emailField.setValue("John.Doe@mail.com");
        // notice submit button changed to enabled automatically once all fields are filled
        lastNameField.clearValue();
        //submitButton.click();
        // notice submit button changed to disabled automatically once value on at least one field is cleared
        lastNameField.setValue("Doe");
        // notice submit button changed to enabled state again once assigning back missing value

        submitButton.click();
        // notice how data submission does not require each field to know about the other
        // mediator knows about each field, but each field does not know about the other

        System.out.println("Submissions list size = " + submissionsList.size());
        submissionsList.getSubmissions().forEach(System.out::println);
    }
}
