
public class EagerlyInitializedSingleton {
    private static final EagerlyInitializedSingleton INSTANCE = new EagerlyInitializedSingleton();

    // private constructor to prevent instance creation
    private EagerlyInitializedSingleton() {
    }

    public static EagerlyInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
