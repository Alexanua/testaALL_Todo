package org.campusmolndal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DatabaseHandler {
    private static final String url = "jdbc:sqlite:Alexanu.db";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            createTableIfNotExists(conn);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private void createTableIfNotExists(Connection connection) {
        String userTableSql = "CREATE TABLE IF NOT EXISTS User (" +
                "id INTEGER PRIMARY KEY," +
                "name TEXT," +
                "age INTEGER," +
                "registerDate TEXT" +
                ")";

        String todoItemTableSql = "CREATE TABLE IF NOT EXISTS ToDoItem (" +
                "id INTEGER PRIMARY KEY," +
                "text TEXT," +
                "done BOOLEAN," +
                "assignedUserId INTEGER," +
                "category TEXT," +
                "assignedTo INTEGER" +
                ")";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(userTableSql);
            stmt.execute(todoItemTableSql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}