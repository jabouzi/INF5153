package org.example.semaine9.chain_of_responsability.example1.authentication;

import org.example.semaine9.chain_of_responsability.example1.authentication.base.AuthenticationData;
import org.example.semaine9.chain_of_responsability.example1.authentication.base.BaseAuthenticationHandler;
import org.example.semaine9.chain_of_responsability.example1.authentication.certificate.CertificateAuthenticationHandler;
import org.example.semaine9.chain_of_responsability.example1.authentication.password.UsernamePasswordAuthenticationHandler;
import org.example.semaine9.chain_of_responsability.example1.authentication.token.TokenAuthenticationHandler;

public class AuthenticationHandler {

    private final BaseAuthenticationHandler rootAuthenticationHandler;

    public AuthenticationHandler() {
        var usernamePasswordAuthenticationHandler = new UsernamePasswordAuthenticationHandler();
        var tokenAuthenticationHandler = new TokenAuthenticationHandler();
        var certificateAuthenticationHandler = new CertificateAuthenticationHandler();

        usernamePasswordAuthenticationHandler.setNextHandler(tokenAuthenticationHandler);
        tokenAuthenticationHandler.setNextHandler(certificateAuthenticationHandler);

        rootAuthenticationHandler = usernamePasswordAuthenticationHandler;
    }

    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Trying to authenticate with " + authenticationData.getClass().getSimpleName() + "...");

        boolean authenticationResult = rootAuthenticationHandler.handleAuthentication(authenticationData);

        System.out.println("Authentication was " + (authenticationResult ? "successful" : "unsuccessful"));
        System.out.println();

        return authenticationResult;
    }
}
