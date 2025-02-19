package org.example.semaine7.stratery.example2;

class ContexteTransport {
    private StrategieTransport strategie;

    public void setStrategie(StrategieTransport strategie) {
        this.strategie = strategie;
    }

    public void executerTransport() {
        strategie.transporter();
    }
}
