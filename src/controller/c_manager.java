/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m_manager;
import view.view_form_home_Manager;

/**
 *
 * @author Bagas
 */
public class c_manager {
    
    m_manager modelManager;
    view_form_home_Manager viewManager;
    
    public c_manager(m_manager modelManager, view_form_home_Manager viewManager) {
        this.modelManager = modelManager;
        this.viewManager = viewManager;
        
        viewManager.CetakBukuListener(new CetakBukuListener());
        viewManager.CetakMahasiswaListener(new CetakMahasiswaListener());
        viewManager.CetakPeminjamanListener(new CetakPeminjamanListener());
        viewManager.SearchBukuListener(new SearchBukuListener());
        viewManager.SearchMahasiswaListener(new SearchMahasiswaListener());
        viewManager.SearchPeminjamanListener(new SearchPeminjamanListener());
        viewManager.SegarkanBukuListener(new SegarkanBukuListener());
        viewManager.SegarkanMahasiswaListener(new SegarkanMahasiswaListener());
        viewManager.SegarkanPeminjamanListener(new SegarkanPeminjamanListener());
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
    
}
