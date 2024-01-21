package jm.task.core.jdbc.util;


import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/usersdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Aka_two_big_s0da";
    private static Connection connection;
        static {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    public static Connection getConnection() {
        return connection;
    }


}
