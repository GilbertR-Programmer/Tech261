package com.sparta.grr;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Printer {
    public static void printResultsOf(ResultSet results) {
        try {
            while(results.next()) {
                System.out.print(results.getInt(1) + " - ");
                System.out.println(results.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
