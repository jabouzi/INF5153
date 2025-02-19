package org.example.semaine7.stratery.example2;

class TransportCamion implements StrategieTransport {
    @Override
    public void transporter() {
        System.out.println("Transport par camion : Lent mais economique.");
    }
}
