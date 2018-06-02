/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author Bagas
 */
public abstract class basemodel {

    public koneksi kon;

    public basemodel() throws SQLException {
        this.kon = new koneksi("postgres", "2796", "Perpustakaan");
    }

    public boolean save(String query) throws SQLException {
        try {
            kon.execute(query);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean update(String query) throws SQLException {
        try {
            kon.execute(query);
            return true;
        } catch (Exception e) {
            return false;

        }
    }


    public boolean delete(String query) throws SQLException {
        try {
            kon.execute(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected abstract boolean simpan(String query) throws SQLException;

    protected abstract boolean perbarui(String query) throws SQLException;

    protected abstract boolean hapus(String query) throws SQLException;
    
}
