package com.sparta.grr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBQueryer {
    private static Connection connectionWithDB = null;

    public DBQueryer(Connection connection) {
        connectionWithDB = connection;
    }

    public ResultSet getFrom(String tableName){
        ResultSet resultOfQuery = null;
        try {
            Statement getStatement = connectionWithDB.createStatement();
            String query = "SELECT * FROM northwind." + tableName;
            resultOfQuery = getStatement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultOfQuery;

    }
}
