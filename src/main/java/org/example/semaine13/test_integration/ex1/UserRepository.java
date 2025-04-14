package org.example.semaine13.test_integration.ex1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final Connection connection;

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    public void createTable() throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY, name TEXT)");
        }
    }

    public void insertUser(String name) throws SQLException {
        try (PreparedStatement pstmt = connection.prepareStatement("INSERT INTO users(name) VALUES(?)")) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
        }
    }

    public List<String> getAllUsers() throws SQLException {
        List<String> users = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT name FROM users")) {
            while (rs.next()) {
                users.add(rs.getString("name"));
            }
        }
        return users;
    }
}
