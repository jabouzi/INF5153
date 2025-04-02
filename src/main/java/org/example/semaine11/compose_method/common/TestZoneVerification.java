package org.example.semaine11.compose_method.common;

import org.example.semaine11.compose_method.apres.ZoneVerificationRefactored;
import org.example.semaine11.compose_method.avant.ZoneVerification;

import java.util.Arrays;

public class TestZoneVerification {
    public static void main(String[] args) {
        int[] zoneCoords = {0, 0, 500, 500};
        CardComponent card = new CardComponent();
        // Avant
        ZoneVerification zoneVerification = new ZoneVerification(zoneCoords);
        System.out.println(card + " Est dans la zone " + Arrays.toString(zoneCoords) + " ? " + zoneVerification.contains(card));

        // Après
        card.setLocation(50, 50);
        ZoneVerificationRefactored verifier = new ZoneVerificationRefactored(zoneCoords);
        System.out.println(card + " Est dans la zone " + Arrays.toString(zoneCoords) + " ? " + verifier.contains(card));
    }
}
