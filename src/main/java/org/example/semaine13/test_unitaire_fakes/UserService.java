package org.example.semaine13.test_unitaire_fakes;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registerUser(String name, String email, String password) {
        if (userRepository.exists(email)) {
            return false; // L'utilisateur existe déjà
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password); // Dans un cas réel, on hasherait le mot de passe

        userRepository.save(user);
        return true;
    }
}
