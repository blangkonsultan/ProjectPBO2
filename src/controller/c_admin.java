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

import javax.swing.JOptionPane;
import view.view_dialog_kelolaMahasiswa;

/**
 *
 * @author Bagas
 */
public class c_admin {

    m_admin modelAdmin;
    c_form_login login;
    view_form_home_admin viewAdmin;
    view_dialog_kelolaBuku dialogBuku;
    view_dialog_kelolaMahasiswa dialogMahasiswa;

    public c_admin(m_admin modelAdmin, view_form_home_admin viewAdmin) throws SQLException {
        this.modelAdmin = modelAdmin;
        this.viewAdmin = viewAdmin;
        viewAdmin.setSessionAdmin(login.getUserLogin());
        viewAdmin.setTabelBuku(modelAdmin.getTableModelBuku());
        viewAdmin.setTabelMahasiswa(modelAdmin.getTableModelMahasiswa());
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
        dialogBuku.setComboBox_KategoriBuku(modelAdmin.comboKategori());
        dialogBuku.buttonEdit(false);
        dialogBuku.buttonSimpan(true);

        dialogMahasiswa = new view_dialog_kelolaMahasiswa(viewAdmin, true);
        this.dialogMahasiswa.simpanKelolaMahasiswaListener(new simpanKelolaMahasiswaListener());
        this.dialogMahasiswa.segarkanKelolaMahasiswaListener(new segarkanKelolaMahasiswaListener());
        this.dialogMahasiswa.perbaruiKelolaMahasiswaListener(new perbaruiKelolaMahasiswaListener());
        this.dialogMahasiswa.hapusKelolaMahasiswaListener(new hapusKelolaMahasiswaListener());
        this.dialogMahasiswa.pilihKelolaMahasiswaListener(new pilihKelolaMahasiswaListener());
        dialogMahasiswa.setTabel(modelAdmin.getTableModelMahasiswa());
        dialogMahasiswa.setComboBox_Fakultas(modelAdmin.comboFakultas());
        dialogMahasiswa.buttonEdit(false);
        dialogMahasiswa.buttonSimpan(true);
    }

    public void resetBuku() {
        dialogBuku.setTextField_JudulBuku("");
        dialogBuku.setTextField_KodeBuku("");
        dialogBuku.setTextField_Penerbit("");
        dialogBuku.setTextField_Stok("");
        dialogBuku.setTextField_Pengarang("");

    }

    public void resetMahasiswa() {
        dialogMahasiswa.setTextField_NIM("");
        dialogMahasiswa.setTextField_NamaLengkap("");
        dialogMahasiswa.setTextField_TempatLahir("");

    }

    private class segarkanKelolaMahasiswaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewAdmin.setTabelMahasiswa(modelAdmin.getTableModelMahasiswa());
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class perbaruiKelolaMahasiswaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (dialogMahasiswa.getTextField_NamaLengkap().equalsIgnoreCase("")
                        || dialogMahasiswa.getTextField_TempatLahir().equalsIgnoreCase("")
                        || dialogMahasiswa.getTanggalLahir().equalsIgnoreCase("")
                        || dialogMahasiswa.getTextField_NIM().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(dialogMahasiswa, "Data Tidak Boleh Kosong!!!");
                } else {
                    int fakultas = 0;
                    if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Ilmu Komputer")) {
                        fakultas = 1;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Teknik")) {
                        fakultas = 2;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Ilmu Sosial dan Politik")) {
                        fakultas = 3;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Kedokteran")) {
                        fakultas = 4;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Teknologi Pertanian")) {
                        fakultas = 5;
                    } else {
                        fakultas = 6;
                    }

                    int baris = dialogMahasiswa.getSelectedRow();
                    String nim = dialogMahasiswa.getTextField_NIM();
                    String nama = dialogMahasiswa.getTextField_NamaLengkap();
                    String tempatlahir = dialogMahasiswa.getTextField_TempatLahir();
                    String tanggal = dialogMahasiswa.getTanggalLahir();
                    String id = dialogMahasiswa.getValueAt(baris, 0);
                    modelAdmin.perbarui("public.mahasiswa\n"
                            + "	SET nama='" + nama + "', \"tempatLahir\"='" + tempatlahir
                            + "', \"tanggalLahir\"='" + tanggal + "', nim='" + nim + "', idfakultas=" + fakultas + ", \"user\"= " + login.getIdLogin() + " WHERE idmahasiswa =" + id + "");
                    dialogMahasiswa.setTabel(modelAdmin.getTableModelMahasiswa());
                    resetMahasiswa();
                    dialogMahasiswa.buttonEdit(false);
                    dialogMahasiswa.buttonSimpan(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class hapusKelolaMahasiswaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int baris = dialogMahasiswa.getSelectedRow();
                String nim = dialogMahasiswa.getValueAt(baris, 1);
                System.out.println(nim);
                modelAdmin.hapus("mahasiswa WHERE nim ='" + nim + "'");
                dialogMahasiswa.setTabel(modelAdmin.getTableModelMahasiswa());
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class pilihKelolaMahasiswaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int baris = dialogMahasiswa.getSelectedRow();
            if (baris != -1) {

                try {

                    String nim = dialogMahasiswa.getValueAt(baris, 1);
                    String nama = dialogMahasiswa.getValueAt(baris, 2);
                    String tempatlahir = dialogMahasiswa.getValueAt(baris, 4);
                    String tanggallahir = dialogMahasiswa.getValueAt(baris, 5);

                    dialogMahasiswa.setComboBox_Fakultas(modelAdmin.comboKategori());
                    dialogMahasiswa.setTextField_NIM(nim);
                    dialogMahasiswa.setTextField_NamaLengkap(nama);
                    dialogMahasiswa.setTextField_TempatLahir(tempatlahir);
                    dialogMahasiswa.setTanggalLahir(tanggallahir);
                    dialogMahasiswa.buttonEdit(true);
                    dialogMahasiswa.buttonSimpan(false);
                } catch (SQLException ex) {
                    Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    private class simpanKelolaMahasiswaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("bisakok");
            try {
                if (dialogMahasiswa.getTextField_NamaLengkap().equalsIgnoreCase("")
                        || dialogMahasiswa.getTextField_TempatLahir().equalsIgnoreCase("")
                        || dialogMahasiswa.getTanggalLahir().equalsIgnoreCase("")
                        || dialogMahasiswa.getTextField_NIM().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(dialogMahasiswa, "Data Tidak Boleh Kosong!!!");
                } else {
                    int fakultas = 0;
                    if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Ilmu Komputer")) {
                        fakultas = 1;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Teknik")) {
                        fakultas = 2;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Ilmu Sosial dan Politik")) {
                        fakultas = 3;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Kedokteran")) {
                        fakultas = 4;
                    } else if (dialogMahasiswa.getComboBox_Fakultas().equals("Fakultas Teknologi Pertanian")) {
                        fakultas = 5;
                    } else {
                        fakultas = 6;
                    }

                    modelAdmin.simpan("public.mahasiswa(\n"
                            + "	idmahasiswa, nama, \"tempatLahir\", \"tanggalLahir\", nim, idfakultas, \"user\")\n"
                            + "	VALUES (default, '" + dialogMahasiswa.getTextField_NamaLengkap() + "', '"
                            + dialogMahasiswa.getTextField_TempatLahir() + "', '" + dialogMahasiswa.getTanggalLahir()
                            + "', '" + dialogMahasiswa.getTextField_NIM() + "'," + fakultas + ", " + login.getIdLogin() + " )");
                    dialogMahasiswa.setTabel(modelAdmin.getTableModelMahasiswa());
                    resetMahasiswa();
                    JOptionPane.showMessageDialog(dialogMahasiswa, "data berhasil disimpan");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
                    dialogBuku.buttonEdit(true);
                    dialogBuku.buttonSimpan(false);
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
                modelAdmin.hapus("buku WHERE kode ='" + kode + "'");
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
                if (dialogBuku.getTextField_KodeBuku().equalsIgnoreCase("")
                        || dialogBuku.getTextField_JudulBuku().equalsIgnoreCase("")
                        || dialogBuku.getTextField_Pengarang().equalsIgnoreCase("")
                        || dialogBuku.getTextField_Penerbit().equalsIgnoreCase("")
                        || dialogBuku.getTextField_Stok().equalsIgnoreCase("")
                        || dialogBuku.getYearChooser_TahunTerbitBuku().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(dialogBuku, "Data tidak boleh ada yang kosong!!!");
                } else {
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

                    int baris = dialogBuku.getSelectedRow();
                    String kode = dialogBuku.getTextField_KodeBuku();
                    String judul = dialogBuku.getTextField_JudulBuku();
                    String pengarang = dialogBuku.getTextField_Pengarang();
                    String penerbit = dialogBuku.getTextField_Penerbit();
                    String stok = dialogBuku.getTextField_Stok();
                    String tahunTerbit = dialogBuku.getYearChooser_TahunTerbitBuku();
                    String id = dialogBuku.getValueAt(baris, 0);
                    modelAdmin.perbarui("public.buku SET kode='" + kode + "', judul='" + judul
                            + "', pengarang='" + pengarang + "', penerbit='" + penerbit
                            + "', stok='" + stok + "', rilis='" + tahunTerbit
                            + "', idkategori=" + kategori + ", \"user\"= " + login.getIdLogin() + " WHERE idbuku = " + id + ";");
                    dialogBuku.setTabel(modelAdmin.getTableModelBuku());
                    resetBuku();
                    dialogBuku.buttonEdit(false);
                    dialogBuku.buttonSimpan(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class segarkanKelolaBukuListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewAdmin.setTabelBuku(modelAdmin.getTableModelBuku());
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
                if (dialogBuku.getTextField_KodeBuku().equalsIgnoreCase("")
                        || dialogBuku.getTextField_JudulBuku().equalsIgnoreCase("")
                        || dialogBuku.getTextField_Pengarang().equalsIgnoreCase("")
                        || dialogBuku.getTextField_Penerbit().equalsIgnoreCase("")
                        || dialogBuku.getTextField_Stok().equalsIgnoreCase("")
                        || dialogBuku.getYearChooser_TahunTerbitBuku().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(dialogBuku, "Data tidak boleh ada yang kosong!!!");
                } else {
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

                    modelAdmin.simpan("public.buku(idbuku, kode, judul, pengarang, penerbit, stok, rilis, idkategori, \"user\")"
                            + " VALUES (default, ' " + dialogBuku.getTextField_KodeBuku() + "', '"
                            + dialogBuku.getTextField_JudulBuku() + "', '" + dialogBuku.getTextField_Pengarang() + "', '"
                            + dialogBuku.getTextField_Penerbit() + "', " + dialogBuku.getTextField_Stok() + ", '"
                            + dialogBuku.getYearChooser_TahunTerbitBuku() + "', " + kategori + ", " + login.getIdLogin() + ")");
                    dialogBuku.setTabel(modelAdmin.getTableModelBuku());
                    resetBuku();
                    JOptionPane.showMessageDialog(dialogBuku, "data berhasil disimpan");
                }
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

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                viewAdmin.setTabelBuku(modelAdmin.getTableModelBukuCari("'" + viewAdmin.getBuku() + "'"));
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SearchMahasiswaListener implements ActionListener {

        public SearchMahasiswaListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewAdmin.setTabelMahasiswa(modelAdmin.getTableModelMahasiswaCari("'" + viewAdmin.getMahasiswa() + "'"));
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
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
                viewAdmin.setTabelBuku(modelAdmin.getTableModelBuku());
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SegarkanMahasiswaListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewAdmin.setTabelMahasiswa(modelAdmin.getTableModelMahasiswa());
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
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

    private class EditBukuListener implements ActionListener {

        public EditBukuListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            dialogBuku.setVisible(true);

        }
    }

    private class EditMahasiswaListener implements ActionListener {

        public EditMahasiswaListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            dialogMahasiswa.setVisible(true);
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
