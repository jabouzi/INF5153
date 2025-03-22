package org.example.semaine6.singleton;

public class SingletonExemple {
    public static void main(String[] args) {
        EagerlyInitializedSingleton.getInstance();
        StaticBlockSingleton.getInstance();
        LazyInitializedSingleton.getInstance();
        ThreadSafeSingleton.getInstance();
        OptimizedThreadSafeSingleton.getInstance();
        EnumSingleton.INSTANCE.someOperation();
    }
}
