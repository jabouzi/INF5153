package org.example.semaine7.chain_of_responsability.example1.authentication.base;

public interface AuthenticationData {

    // Checks if the current instance (this) is assignable to the given class (aClass).
    // Determines whether an object can be treated as a specific AuthenticationData subtype.
    default boolean doesSupport(Class<? extends AuthenticationData> aClass) {
        return aClass.isAssignableFrom(this.getClass());
    }

   // Casts the current instance (this) into a specific subtype of AuthenticationData.
   // Use case: Helps avoid explicit casting and makes working with different authentication types easier.
    @SuppressWarnings("unchecked")
    default <T extends AuthenticationData> T toType() {
        return (T) this;
    }
}
