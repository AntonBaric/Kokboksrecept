package com.company;

import java.sql.*;

public class Database {
    Connection conn = null;
    Database() {
        ConnectToDatabase();
    }
    private void ConnectToDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Kokboksrecept.db");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
