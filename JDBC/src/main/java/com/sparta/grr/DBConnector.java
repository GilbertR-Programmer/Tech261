package com.sparta.grr;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBConnector {
    private static final String PROPERTIES_ADDRESS = "src/main/resources/mysql.properties";
    private static Connection mainConnection = null;
    private DBConnector(){

    }
    static public Connection getConnection(){
        Properties properties = getConnectionProperties();
        if (mainConnection != null) {
            return mainConnection;
        }

        try {
            mainConnection = DriverManager.getConnection(
                    properties.getProperty("url"),properties.getProperty("username"),
                    properties.getProperty("password"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mainConnection;
    }

    private static Properties getConnectionProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_ADDRESS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static void closeConnection() {
        try {
            mainConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
