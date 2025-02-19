package org.example.semaine7.chain_of_responsability.example1.authentication.password;

import org.example.semaine7.chain_of_responsability.example1.authentication.base.AuthenticationData;

public class UsernamePasswordAuthenticationData implements AuthenticationData {

    private final String username;
    private final String password;

    public UsernamePasswordAuthenticationData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
