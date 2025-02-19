package org.example.semaine7.chain_of_responsability.example1.authentication.password;

import org.example.semaine7.chain_of_responsability.example1.authentication.base.AuthenticationData;
import org.example.semaine7.chain_of_responsability.example1.authentication.base.BaseAuthenticationHandler;

public class UsernamePasswordAuthenticationHandler extends BaseAuthenticationHandler {
    @Override
    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Executing username and password based authentication....");

        if (authenticationData.doesSupport(UsernamePasswordAuthenticationData.class)) {
            UsernamePasswordAuthenticationData usernamePasswordAuthenticationData = authenticationData.toType();

            return usernamePasswordAuthenticationData.getUsername().equals("admin")
                    && usernamePasswordAuthenticationData.getPassword().equals("123");
        }

        return handleNext(authenticationData);
    }
}
