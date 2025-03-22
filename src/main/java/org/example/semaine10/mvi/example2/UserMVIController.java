package org.example.semaine10.mvi.example2;

import java.util.function.Consumer;

// MVI Controller: Processes intents and updates state
class UserMVIController {
    private UserModel model;
    private Consumer<Boolean> stateListener;

    public UserMVIController(UserModel model, Consumer<Boolean> stateListener) {
        this.model = model;
        this.stateListener = stateListener;
    }

    public void processIntent(LoginIntent intent) {
        boolean result = model.authenticate(intent.username, intent.password);
        stateListener.accept(result);
    }
}
