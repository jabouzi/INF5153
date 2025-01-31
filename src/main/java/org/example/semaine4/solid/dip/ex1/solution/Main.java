package org.example.semaine4.solid.dip.ex1.solution;

public class Main {
    public static void main(String[] args) {
        Notificateur email = new ServiceEmail();
        GestionnaireNotification gestionnaire = new GestionnaireNotification(email);
        gestionnaire.notifier("Bonjour via e-mail !");

        Notificateur sms = new ServiceSMS();
        gestionnaire = new GestionnaireNotification(sms);
        gestionnaire.notifier("Bonjour via SMS !");
    }
}
