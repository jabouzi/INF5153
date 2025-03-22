package org.example.semaine9.mediator.example1.components;


import org.example.semaine9.mediator.example1.dto.Submission;

import java.util.LinkedList;
import java.util.List;

public class SubmissionsList extends AbstractComponent {
    private final List<Submission> submissions = new LinkedList<>();

    public void addSubmission(Submission submission) {
        submissions.add(submission);
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public int size() {
        return submissions.size();
    }
}
