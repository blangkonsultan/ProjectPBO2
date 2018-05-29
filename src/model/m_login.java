package model;

import controller.c_form_login;
import java.sql.ResultSet;
import java.sql.SQLException;

public class m_login {

    private koneksi con;
    private basemodel base;

    public m_login() throws SQLException {
        con = new koneksi("postgres", "2796", "Perpustakaan") {
            @Override
            public void execute(String sql) throws SQLException {

            }
        };
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
        c_form_login.setUserLogin(username);
        return result;

    }
}
