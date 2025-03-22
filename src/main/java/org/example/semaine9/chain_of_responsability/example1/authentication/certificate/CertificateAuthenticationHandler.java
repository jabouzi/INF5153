package org.example.semaine9.chain_of_responsability.example1.authentication.certificate;

import org.example.semaine9.chain_of_responsability.example1.authentication.base.AuthenticationData;
import org.example.semaine9.chain_of_responsability.example1.authentication.base.BaseAuthenticationHandler;

public class CertificateAuthenticationHandler extends BaseAuthenticationHandler {
    @Override
    public boolean handleAuthentication(AuthenticationData authenticationData) {
        System.out.println("Executing Certificate based authentication....");

        if (authenticationData.doesSupport(CertificateAuthenticationData.class)) {
            CertificateAuthenticationData certificateAuthenticationData = authenticationData.toType();

            return certificateAuthenticationData.getCertificate().equals("certificate150");
        }

        return handleNext(authenticationData);
    }
}
