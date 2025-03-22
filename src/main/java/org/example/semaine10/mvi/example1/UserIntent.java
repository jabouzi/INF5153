package org.example.semaine10.mvi.example1;

public class UserIntent {
    public static final String FETCH_USER = "FETCH_USER";
    private String action;

    public UserIntent(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
