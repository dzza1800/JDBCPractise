package com.qa.project.finance;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost:3306/finances";
    final String UNAME = "root";
    final String PASSWORD = "Password123";
    //Root - Please if your password isnt root     //Singleton, hence we need to check if null or not    // Create an instance if null    // Otherwise return this (the instance we have already created)    //Connection     
    Connection conn;
    public Connection connect() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, UNAME, PASSWORD);
            
        } catch (Exception e) {
            System.out.println("No connection sorry boss");
        }
        return conn;
    }
}
