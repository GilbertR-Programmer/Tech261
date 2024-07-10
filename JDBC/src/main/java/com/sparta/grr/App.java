package com.sparta.grr;

import java.sql.*;

public class App {
    //Connection
    //Statements
    //Results
    public static void main(String[] args) {
        DBQueryer db = new DBQueryer(DBConnector.getConnection());

        ResultSet results = db.getFrom("employees");

        ResultSet rs2 = db.getFrom("customers");

        Printer.printResultsOf(results);
        Printer.printResultsOf(rs2);

        DBConnector.closeConnection();
    }
}
