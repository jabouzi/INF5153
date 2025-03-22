package org.example.semaine9.chain_of_responsability.example1.authentication.token;

import org.example.semaine9.chain_of_responsability.example1.authentication.base.AuthenticationData;
import org.example.semaine9.chain_of_responsability.example1.authentication.base.BaseAuthenticationHandler;

public class TokenAuthenticationHandler extends BaseAuthenticationHandler {
    @Override
    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Executing Token based authentication....");

        if (authenticationData.doesSupport(TokenAuthenticationData.class)) {
            TokenAuthenticationData tokenAuthenticationData = authenticationData.toType();

            return tokenAuthenticationData.getToken().equals("token200");
        }

        return handleNext(authenticationData);
    }
}
