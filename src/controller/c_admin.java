/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m_admin;
import view.view_form_home_admin;

/**
 *
 * @author Bagas
 */
public class c_admin {
    
    m_admin modelAdmin;
    view_form_home_admin viewAdmin;
    
    public c_admin(m_admin modelAdmin, view_form_home_admin viewAdmin) {
        this.modelAdmin = modelAdmin;
        this.viewAdmin = viewAdmin;
        
        viewAdmin.CetakBukuListener(new CetakBukuListener());
        viewAdmin.CetakMahasiswaListener(new CetakMahasiswaListener());
        viewAdmin.CetakPeminjamanListener(new CetakPeminjamanListener());
        viewAdmin.SearchBukuListener(new SearchBukuListener());
        viewAdmin.SearchMahasiswaListener(new SearchMahasiswaListener());
        viewAdmin.SearchPeminjamanListener(new SearchPeminjamanListener());
        viewAdmin.SegarkanBukuListener(new SegarkanBukuListener());
        viewAdmin.SegarkanMahasiswaListener(new SegarkanMahasiswaListener());
        viewAdmin.SegarkanPeminjamanListener(new SegarkanPeminjamanListener());
        viewAdmin.EditBukuListener(new EditBukuListener());
        viewAdmin.EditMahasiswaListener(new EditMahasiswaListener());
        viewAdmin.EditPeminjamanListener(new EditPeminjamanListener());
    }
    
    private static class CetakBukuListener implements ActionListener {
        
        public CetakBukuListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class CetakMahasiswaListener implements ActionListener {
        
        public CetakMahasiswaListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class CetakPeminjamanListener implements ActionListener {
        
        public CetakPeminjamanListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class SearchBukuListener implements ActionListener {
        
        public SearchBukuListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class SearchMahasiswaListener implements ActionListener {
        
        public SearchMahasiswaListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class SearchPeminjamanListener implements ActionListener {
        
        public SearchPeminjamanListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class SegarkanBukuListener implements ActionListener {
        
        public SegarkanBukuListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class SegarkanMahasiswaListener implements ActionListener {
        
        public SegarkanMahasiswaListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class SegarkanPeminjamanListener implements ActionListener {
        
        public SegarkanPeminjamanListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class EditBukuListener implements ActionListener {
        
        public EditBukuListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class EditMahasiswaListener implements ActionListener {
        
        public EditMahasiswaListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class EditPeminjamanListener implements ActionListener {
        
        public EditPeminjamanListener() {
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
