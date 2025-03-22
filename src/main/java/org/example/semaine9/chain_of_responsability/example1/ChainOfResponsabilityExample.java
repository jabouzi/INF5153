package org.example.semaine9.chain_of_responsability.example1;

import org.example.semaine9.chain_of_responsability.example1.authentication.AuthenticationHandler;
import org.example.semaine9.chain_of_responsability.example1.authentication.biometric.BiometricAuthenticationData;
import org.example.semaine9.chain_of_responsability.example1.authentication.certificate.CertificateAuthenticationData;
import org.example.semaine9.chain_of_responsability.example1.authentication.password.UsernamePasswordAuthenticationData;
import org.example.semaine9.chain_of_responsability.example1.authentication.token.TokenAuthenticationData;

class ChainOfResponsabilityExample {
    public static void main(String[] args) {
        var authenticationHandler = new AuthenticationHandler();

        authenticationHandler.handleAuthentication(new UsernamePasswordAuthenticationData("admin", "123"));
        authenticationHandler.handleAuthentication(new TokenAuthenticationData("token200"));
        authenticationHandler.handleAuthentication(new CertificateAuthenticationData("certificate150"));
        authenticationHandler.handleAuthentication(new BiometricAuthenticationData());
    }
}
