/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author eldi
 */
public class koneksi {

    private static Connection connection = null;
    
    private final String url = "jdbc:postgresql://localhost:5432/perpustakaan";
    private final String user = "postgres";
    private final String password = "2796";

    public Connection connect() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }

}