package org.example.semaine9.chain_of_responsability.example1.authentication.certificate;

import org.example.semaine9.chain_of_responsability.example1.authentication.base.AuthenticationData;

public class CertificateAuthenticationData implements AuthenticationData {

    private final String certificate;

    public CertificateAuthenticationData(String certificate) {
        this.certificate = certificate;
    }

    public String getCertificate() {
        return certificate;
    }
}
