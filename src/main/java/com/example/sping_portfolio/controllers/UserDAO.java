package com.example.sping_portfolio.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public User checkLogin(String firstname, String password) throws SQLException,
            ClassNotFoundException {
        String jdbcURL = "jdbc:sqlite:src/main/resources/static/database/mydatabase.db";
        String dbUser = "user";
        String dbPassword = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql = "SELECT * FROM rc_table WHERE FIRSTNAME = ? and PASSWORD = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, firstname);
        statement.setString(2, password);

        ResultSet result = statement.executeQuery();

        User user = null;

        if (result.next()) {
            user = new User();
            user.setFirstname(result.getString("firstname"));
        }

        connection.close();

        return user;
    }
}

