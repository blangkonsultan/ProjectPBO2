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
import model.m_admin;
import model.m_login;
import view.view_dialog_kelolaBuku;
import view.view_form_home_admin;
import view.view_form_login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bagas
 */
public class c_admin {

    JFrame frame;
    m_admin modelAdmin;
    view_form_home_admin viewAdmin;
    view_dialog_kelolaBuku dialogBuku;

    public c_admin(m_admin modelAdmin, view_form_home_admin viewAdmin) throws SQLException {
        this.modelAdmin = modelAdmin;
        this.viewAdmin = viewAdmin;
        viewAdmin.setTabel(modelAdmin.getTableModelBuku());
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
        viewAdmin.logoutListener(new logoutListener());

        dialogBuku = new view_dialog_kelolaBuku(viewAdmin, true);
        this.dialogBuku.simpanKelolaBukuListener(new simpanKelolaBukuListener());
        this.dialogBuku.segarkanKelolaBukuListener(new segarkanKelolaBukuListener());
        this.dialogBuku.perbaruiKelolaBukuListener(new perbaruiKelolaBukuListener());
        this.dialogBuku.hapusKelolaBukuListener(new hapusKelolaBukuListener());
        this.dialogBuku.pilihKelolaBukuListener(new pilihKelolaBukuListener());
        dialogBuku.setTabel(modelAdmin.getTableModelBuku());
    }

    private class pilihKelolaBukuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int baris = dialogBuku.getSelectedRow();
            if (baris != -1) {


                try {

                    String kode = dialogBuku.getValueAt(baris, 1);
                    String judul = dialogBuku.getValueAt(baris, 2);
                    String pengarang = dialogBuku.getValueAt(baris, 3);
                    String penerbit = dialogBuku.getValueAt(baris, 4);
                    String stok = dialogBuku.getValueAt(baris, 7);
                    String tahunTerbit = dialogBuku.getValueAt(baris, 5);

                    dialogBuku.setComboBox_KategoriBuku(modelAdmin.comboKategori());
                    dialogBuku.setTextField_KodeBuku(kode);
                    dialogBuku.setTextField_JudulBuku(judul);
                    dialogBuku.setTextField_Pengarang(pengarang);
                    dialogBuku.setTextField_Penerbit(penerbit);
                    dialogBuku.setTextField_Stok(stok);
                    dialogBuku.setYearChooser_TahunTerbitBuku(tahunTerbit);
                } catch (SQLException ex) {
                    Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    private class hapusKelolaBukuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int baris = dialogBuku.getSelectedRow();
                String kode = dialogBuku.getValueAt(baris, 1);
                System.out.println(kode);
                modelAdmin.hapus(kode);
                dialogBuku.setTabel(modelAdmin.getTableModelBuku());
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class perbaruiKelolaBukuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int kategori = 0;
                if (dialogBuku.getComboBox_KategoriBuku().equals("Matematika")) {
                    kategori = 1;
                } else if (dialogBuku.getComboBox_KategoriBuku().equals("B.Inggris")) {
                    kategori = 2;
                } else if (dialogBuku.getComboBox_KategoriBuku().equals("B.Indonesia")) {
                    kategori = 3;
                } else {
                    kategori = 4;
                }

                String kategorix = Integer.toString(kategori);
                System.out.println(kategorix);
                int baris = dialogBuku.getSelectedRow();
                String kode = dialogBuku.getTextField_KodeBuku();
                String judul = dialogBuku.getTextField_JudulBuku();
                String pengarang = dialogBuku.getTextField_Pengarang();
                String penerbit = dialogBuku.getTextField_Penerbit();
                String stok = dialogBuku.getTextField_Stok();
                String tahunTerbit = dialogBuku.getYearChooser_TahunTerbitBuku();
                String id = dialogBuku.getValueAt(baris, 0);
                modelAdmin.perbarui("kode='" + kode + "', judul='" + judul + "', pengarang='" + pengarang + "', penerbit='" + penerbit + "', stok='" + stok + "', rilis='" + tahunTerbit + "', idkategori=" + kategorix + "	WHERE idbuku = "+id+";");
                dialogBuku.setTabel(modelAdmin.getTableModelBuku());
//                clear();
//                theView.btnEdit(false);
//                theView.btnTambah(true);
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class segarkanKelolaBukuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewAdmin.setTabel(modelAdmin.getTableModelBuku());
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private class simpanKelolaBukuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(dialogBuku.getYearChooser_TahunTerbitBuku());
            System.out.println("bisakok");
            try {
                int kategori = 0;
                if (dialogBuku.getComboBox_KategoriBuku().equals("Matematika")) {
                    kategori = 1;
                } else if (dialogBuku.getComboBox_KategoriBuku().equals("B.Inggris")) {
                    kategori = 2;
                } else if (dialogBuku.getComboBox_KategoriBuku().equals("B.Indonesia")) {
                    kategori = 3;
                } else {
                    kategori = 4;
                }

                String kategorix = Integer.toString(kategori);
                System.out.println(kategorix);
                modelAdmin.simpan("default, '" + dialogBuku.getTextField_KodeBuku()
                        + "', '" + dialogBuku.getTextField_JudulBuku() + "', '"
                        + dialogBuku.getTextField_Pengarang() + "', '"
                        + dialogBuku.getTextField_Penerbit() + "', " + dialogBuku.getTextField_Stok()
                        + ", '" + dialogBuku.getYearChooser_TahunTerbitBuku() + "', " + kategorix + "");
                dialogBuku.setTabel(modelAdmin.getTableModelBuku());
                JOptionPane.showMessageDialog(frame, "data berhasil disimpan");
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

        public SegarkanBukuListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewAdmin.setTabel(modelAdmin.getTableModelBuku());
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SegarkanMahasiswaListener implements ActionListener {

        public SegarkanMahasiswaListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    private class EditBukuListener implements ActionListener {

        public EditBukuListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //                new c_admin(modelAdmin, dialogBuku);
            dialogBuku.setVisible(true);
        }
    }

    private class EditMahasiswaListener implements ActionListener {

        public EditMahasiswaListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class EditPeminjamanListener implements ActionListener {

        public EditPeminjamanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class logoutListener implements ActionListener {

        public logoutListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            view.view_form_login view;
            model.m_login model;
            try {
                view = new view_form_login();
                model = new m_login();
                new c_form_login(view, model);
                viewAdmin.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
