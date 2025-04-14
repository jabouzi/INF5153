package org.example.semaine13.test_unitaire_fakes;

public interface UserRepository {
    User findById(long id);

    void save(User user);

    boolean exists(String email);
}
