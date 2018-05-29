package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class koneksi {
     private Connection con;
    private Statement stm;

    public koneksi(String username, String password, String db) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/" + db;
        con = DriverManager.getConnection(url, username, password);
        stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
    }


    public void execute(String sql) throws SQLException {
        this.stm.executeUpdate(sql);
    }

    public ResultSet getResult(String sql) throws SQLException {
       
        return stm.executeQuery(sql);
    }

    public koneksi Koneksi() {
        return (koneksi) con;
    }
}