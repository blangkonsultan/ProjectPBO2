/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_login;
import model.m_manager;
import view.view_form_home_Manager;
import view.view_form_login;

/**
 *
 * @author Bagas
 */
public class c_manager {
    private c_form_login login;
    private m_manager modelManager;
    private view_form_home_Manager viewManager;

    public c_manager(m_manager modelManager, view_form_home_Manager viewManager) throws SQLException {
        this.modelManager = modelManager;
        this.viewManager = viewManager;
        viewManager.setSessionManager(login.getUserLogin());
        viewManager.setTabelBuku(modelManager.getTableModelBuku());
        viewManager.setTabelMahasiswa(modelManager.getTableModelMahasiswa());
        viewManager.CetakBukuListener(new CetakBukuListener());
        viewManager.CetakMahasiswaListener(new CetakMahasiswaListener());
        viewManager.CetakPeminjamanListener(new CetakPeminjamanListener());
        viewManager.SearchBukuListener(new SearchBukuListener());
        viewManager.SearchMahasiswaListener(new SearchMahasiswaListener());
        viewManager.SearchPeminjamanListener(new SearchPeminjamanListener());
        viewManager.SegarkanBukuListener(new SegarkanBukuListener());
        viewManager.SegarkanPeminjamanListener(new SegarkanPeminjamanListener());
        viewManager.SegarkanMahasiswaListener(new SegarkanMahasiswaListener());
        viewManager.logoutListener(new logoutListener());
    }

    private class logoutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.view_form_login view = new view_form_login();
            model.m_login model;
            try {
                model = new m_login();
                new c_form_login(view, model);
                viewManager.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class CetakBukuListener implements ActionListener {

        public CetakBukuListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class CetakMahasiswaListener implements ActionListener {

        public CetakMahasiswaListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class CetakPeminjamanListener implements ActionListener {

        public CetakPeminjamanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class SearchBukuListener implements ActionListener {

        public SearchBukuListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class SearchMahasiswaListener implements ActionListener {

        public SearchMahasiswaListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class SearchPeminjamanListener implements ActionListener {

        public SearchPeminjamanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class SegarkanBukuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewManager.setTabelBuku(modelManager.getTableModelBuku());
            } catch (SQLException ex) {
                Logger.getLogger(c_manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SegarkanMahasiswaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewManager.setTabelMahasiswa(modelManager.getTableModelMahasiswa());
            } catch (SQLException ex) {
                Logger.getLogger(c_manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SegarkanPeminjamanListener implements ActionListener {

        public SegarkanPeminjamanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
