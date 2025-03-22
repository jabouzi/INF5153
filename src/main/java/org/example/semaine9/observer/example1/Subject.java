package org.example.semaine9.observer.example1;

// Subject Interface
interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
