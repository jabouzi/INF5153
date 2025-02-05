package org.example.semaine5.patrons.singleton.synchro;

class DatabaseConnectionRunnable implements Runnable {
    public void run() {
        DatabaseConnection db = DatabaseConnection.getInstance();
        System.out.println("Instance obtenue : " + db);
    }
}

