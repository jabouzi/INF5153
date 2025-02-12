package org.example.semaine6.adapter.exemple2;

// Programme principal (Client)
public class AdapterExample {
    public static void main(String[] args) {
        // Création du cliquet de 1/2”
        Ratchet1_2 ratchet1_2 = new Ratchet1_2();

        // Adaptation pour une douille de 1/4”
        Socket adapter = new Adapter1_2To1_4(ratchet1_2);

        // Utilisation de la douille via l’adaptateur
        adapter.useSocket();
    }
}
