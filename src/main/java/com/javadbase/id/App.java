package com.javadbase.id;

import com.javadbase.id.dbase.ConnectToDBase;

import java.sql.SQLException;

public class App {
    private static ConnectToDBase connectToDBase = new ConnectToDBase();
    
    public static void main(String[] args ) throws SQLException, Exception {
        System.out.println(connectToDBase.connect("jdbc:mysql://localhost:3306", "root", "mifandika"));
    }
}
