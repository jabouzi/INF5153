package org.example.semaine13.test_integration.ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

class UserRepositoryIT {
    private Connection connection;
    private UserRepository repository;

    @BeforeEach
    void setUp() throws SQLException {
        // Connexion à une base SQLite en mémoire (pas de fichier physique)
        connection = DriverManager.getConnection("jdbc:sqlite::memory:");
        repository = new UserRepository(connection);
        repository.createTable();
    }

    @Test
    void shouldInsertAndRetrieveUsers() throws SQLException {
        // Insertion
        repository.insertUser("Alice");
        repository.insertUser("Bob");

        // Vérification
        List<String> users = repository.getAllUsers();
        assertAll(
                () -> assertEquals(2, users.size()),
                () -> assertTrue(users.contains("Alice")),
                () -> assertTrue(users.contains("Bob"))
        );
    }

    @AfterEach
    void tearDown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}