package org.example.semaine13.test_unitaire_fakes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    private UserService userService;
    private FakeUserRepository fakeUserRepository;

    @BeforeEach
    void setUp() {
        fakeUserRepository = new FakeUserRepository();
        userService = new UserService(fakeUserRepository);
    }

    @Test
    void testRegisterNewUser() {
        boolean result = userService.registerUser("John Doe", "john@example.com", "password123");

        assertTrue(result, "L'enregistrement d'un nouvel utilisateur devrait réussir");
        assertTrue(fakeUserRepository.exists("john@example.com"), "L'utilisateur devrait être enregistré dans le repository");
    }

    @Test
    void testRegisterExistingUser() {
        // Pré-enregistrement d'un utilisateur
        User existingUser = new User();
        existingUser.setEmail("john@example.com");
        fakeUserRepository.save(existingUser);

        boolean result = userService.registerUser("John Doe", "john@example.com", "password123");

        assertFalse(result, "L'enregistrement d'un utilisateur existant devrait échouer");
    }

}