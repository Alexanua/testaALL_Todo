package org.campusmolndal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class UserService {
    private DatabaseHandler databaseHandler;


    public UserService(DatabaseHandler databaseHandler) {
        this.databaseHandler = databaseHandler;
    }

    public void registerUser(User user) {
        String sql = "INSERT INTO User(id, name, age, registerDate) VALUES(?, ?, ?, ?)";

        try (Connection connection = databaseHandler.connect();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setInt(3, user.getAge());
            pstmt.setString(4, user.getRegisterDate().toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteUser(int userId) {
        String sql = "DELETE FROM User WHERE id = ?";

        try (Connection connection = databaseHandler.connect();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, userId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public User getUser(int userId) {
        String sql = "SELECT id, name, age, registerDate FROM User WHERE id = ?";
        User user = null;

        try (Connection connection = databaseHandler.connect();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, userId);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    LocalDate registerDate = LocalDate.parse(rs.getString("registerDate"));

                    user = new User(id, name, age, registerDate);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public void updateUser(User user) {
        String sql = "UPDATE User SET name = ?, age = ?, registerDate = ? WHERE id = ?";

        try (Connection connection = databaseHandler.connect();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, user.getName());
            pstmt.setInt(2, user.getAge());
            pstmt.setString(3, user.getRegisterDate().toString());
            pstmt.setInt(4, user.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
