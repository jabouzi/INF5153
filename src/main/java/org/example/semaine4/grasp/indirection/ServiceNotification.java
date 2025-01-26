package org.example.semaine4.grasp.indirection;

import java.util.List;

class ServiceNotification {
    private List<CanalNotification> canaux;

    public ServiceNotification(List<CanalNotification> canaux) {
        this.canaux = canaux;
    }

    public void notifierTous(String message) {
        for (CanalNotification canal : canaux) {
            canal.envoyerNotification(message);
        }
    }
}
