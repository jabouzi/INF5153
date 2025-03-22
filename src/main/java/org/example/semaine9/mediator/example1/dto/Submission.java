package org.example.semaine9.mediator.example1.dto;

import java.util.stream.Stream;

public record Submission(String firstName, String lastName, String email) {
    public boolean isFullyFilled() {
        return Stream.of(firstName, lastName, email)
                .allMatch(s -> s != null && !s.trim().isEmpty());
    }
}
