package model;

import controller.c_form_login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class m_login extends basemodel {

    private koneksi con;
    private basemodel base;
    private String[] session = new String[2];

    public m_login() throws SQLException {
        con = new koneksi("postgres", "2796", "Perpustakaan") {
            @Override
            public void execute(String sql) throws SQLException {

            }
        };
    }

    public void getSession(String username, String password) throws SQLException {
        String query = "select \"idUser\", nama from public.user where nama = '" + username + "' and password = '" + password + "'";
        ResultSet rs = con.getResult(query);
        while (rs.next()) {
            c_form_login.setIdLogin(rs.getString("idUser"));
            c_form_login.setUserLogin(rs.getString("nama"));
        }

    }

    public int lvlLogin(String username, String password) throws SQLException {
        int level = 0;
        String query = "SELECT tingkatan FROM public.\"user\" where nama = '" + username + "' and password = '" + password + "'";
        ResultSet rs = con.getResult(query);
        rs.next();
        level = Integer.valueOf(rs.getString(1));
        return level;
    }

    public int login(String username, String password) throws SQLException {
        int result = 0;

        String query = "SELECT tingkatan FROM public.\"user\" where nama = '" + username + "' and password = '" + password + "'";
        ResultSet rs = con.getResult(query);
        rs.last();
        result = rs.getRow();
        return result;

    }

    public String[] comboHakAkses() throws SQLException {
        String query = "SELECT jabatan FROM public.tingkatan";
        String db = "Perpustakaan";
        String username = "postgres";
        String password = "2796";
        String url = "jdbc:postgresql://localhost:5432/" + db;
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        Statement stmq = con.createStatement();
        ResultSet rs = stmt.executeQuery();
        rs.getRow();
        rs.last();
        String kategori[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            kategori[a] = rs.getString("jabatan");
            a++;
        }
        return kategori;
    }

    public void getidBuku(String kodeBuku) throws SQLException {
        String query = "SELECT idbuku FROM public.buku \n"
                + "where kode = '" + kodeBuku + "';";
        ResultSet rs = con.getResult(query);
        while (rs.next()) {
            c_form_login.setIdLogin(rs.getString("idUser"));
            c_form_login.setUserLogin(rs.getString("nama"));
        }

    }

    @Override
    public boolean simpan(String query) throws SQLException {
        String queri = "INSERT INTO " + query;
        System.out.println(queri);
        return super.save(queri);

    }

    @Override
    public boolean perbarui(String query) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hapus(String query) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
