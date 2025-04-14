package org.example.semaine13.test_unitaire_fakes;

import java.util.HashMap;
import java.util.Map;

// Classe interne pour le faux repository
class FakeUserRepository implements UserRepository {
    private Map<Long, User> usersById = new HashMap<>();
    private Map<String, User> usersByEmail = new HashMap<>();
    private long nextId = 1;

    @Override
    public User findById(long id) {
        return usersById.get(id);
    }

    @Override
    public void save(User user) {
        // Simuler l'auto-incrémentation d'un ID
        if (user.getId() == 0) {
            user.setId(nextId++);
        }
        usersById.put(user.getId(), user);
        usersByEmail.put(user.getEmail(), user);
    }

    @Override
    public boolean exists(String email) {
        return usersByEmail.containsKey(email);
    }
}
