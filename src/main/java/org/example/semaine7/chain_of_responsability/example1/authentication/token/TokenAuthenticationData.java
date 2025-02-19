package org.example.semaine7.chain_of_responsability.example1.authentication.token;

import org.example.semaine7.chain_of_responsability.example1.authentication.base.AuthenticationData;

public class TokenAuthenticationData implements AuthenticationData {

    private final String token;

    public TokenAuthenticationData(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
