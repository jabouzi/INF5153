package org.example.semaine9.stratery.example2;

class TransportAvion implements StrategieTransport {
    @Override
    public void transporter() {
        System.out.println("Transport par avion : Rapide mais cher.");
    }
}
