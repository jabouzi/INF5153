package org.example.semaine5.patrons.singleton.thread_not_safe;

import org.example.semaine5.patrons.singleton.DatabaseConnection;

class DatabaseConnectionRunnable implements Runnable {
    public void run() {
        DatabaseConnection db = DatabaseConnection.getInstance();
        System.out.println("Instance obtenue : " + db);
    }
}

