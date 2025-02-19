package org.example.semaine7.chain_of_responsability.example1.authentication.base;

public abstract class BaseAuthenticationHandler {
    private BaseAuthenticationHandler nextHandler;

    public abstract boolean handleAuthentication(AuthenticationData authenticationData);

    public void setNextHandler(BaseAuthenticationHandler handler) {
        this.nextHandler = handler;
    }

    protected boolean handleNext(AuthenticationData authenticationData) {
        if (nextHandler != null) {
            return nextHandler.handleAuthentication(authenticationData);
        }
        return false;
    }
}
