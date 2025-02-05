package org.example.semaine5.patrons.singleton.thread_not_safe;

public class SingletonDatabaseThreadProblem {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DatabaseConnectionRunnable());
        Thread thread2 = new Thread(new DatabaseConnectionRunnable());

        thread1.start();
        thread2.start();
    }
}
