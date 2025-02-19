package org.example.semaine7.mediator.example1.dialog;


import org.example.semaine7.mediator.example1.components.SubmissionsList;
import org.example.semaine7.mediator.example1.components.SubmitButton;
import org.example.semaine7.mediator.example1.components.TextField;
import org.example.semaine7.mediator.example1.dto.Submission;

public class Dialog implements Mediator {
    private final TextField firstNameField;
    private final TextField lastNameField;
    private final TextField emailField;
    private final SubmitButton submitButton;
    private final SubmissionsList submissionsList;

    public Dialog(TextField firstNameField, TextField lastNameField, TextField emailField, SubmitButton submitButton, SubmissionsList submissionsList) {
        this.firstNameField = firstNameField;
        this.lastNameField = lastNameField;
        this.emailField = emailField;
        this.submitButton = submitButton;
        this.submissionsList = submissionsList;
    }

    @Override
    public void onInputDataChange() {
        Submission submission = createSubmission();
        submitButton.setEnabled(submission.isFullyFilled());
    }

    @Override
    public void processSubmission() {
        Submission submission = createSubmission();
        if (!submission.isFullyFilled())
            throw new IllegalStateException("Submission is not fully filled.");

        System.out.println("Processing submission...");
        submissionsList.addSubmission(createSubmission());
    }

    private Submission createSubmission() {
        return new Submission(
                firstNameField.getValue(),
                lastNameField.getValue(),
                emailField.getValue()
        );
    }
}
