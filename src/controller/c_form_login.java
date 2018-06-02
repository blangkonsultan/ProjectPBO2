package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.koneksi;
import model.m_admin;
import model.m_login;
import model.m_manager;
import view.view_form_daftar;
import view.view_form_home_Manager;
import view.view_form_home_admin;
import view.view_form_login;
import view.view_home;

public class c_form_login {

    private view_home viewHome = new view_home();
    private view_form_login viewLogin = new view_form_login();
    private view_form_daftar viewDaftar = new view_form_daftar();
    private m_login modelLogin;
    private static String username;
    private static String id;
    private koneksi kon;

    public c_form_login(view_form_login viewLogin, m_login modelLogin) throws SQLException {
        this.viewLogin = viewLogin;
        this.modelLogin = modelLogin;
        viewLogin.setVisible(true);
        viewLogin.loginListener(new LoginListener());
        viewLogin.kembaliLoginListener(new kembaliLoginListener());
    }

    public c_form_login(view_home viewHome, m_login modelLogin) throws SQLException {
        this.viewHome = viewHome;
        this.modelLogin = modelLogin;
        viewHome.setVisible(true);
        viewHome.DaftarListener(new DaftarListener());
        viewHome.LoginHomeListener(new LoginHomeListener());
    }

    public c_form_login(view_form_daftar viewDaftar, m_login modelLogin) throws SQLException {
        this.viewDaftar = viewDaftar;
        this.modelLogin = modelLogin;
        viewDaftar.setVisible(true);
        viewDaftar.setComboBox_HakAkses(modelLogin.comboHakAkses());
        viewDaftar.kembaliDaftarListener(new kembaliDaftarListener());
        viewDaftar.DaftarAkunListener(new DaftarAkunListener());
    }

    public static void setIdLogin(String id) {
        c_form_login.id = id;
    }

    public static String getIdLogin() {
        return id;
    }

    public static void setUserLogin(String username) {
        c_form_login.username = username;
    }

    public static String getUserLogin() {
        return username;
    }

    public void resetDaftar() {
        viewDaftar.setTextField_Username("");
        viewDaftar.setPasswordField_Password("");
    }

    private class kembaliDaftarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_form_login(viewHome, modelLogin);
                viewLogin.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_form_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class kembaliLoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_form_login(viewHome, modelLogin);
                viewLogin.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_form_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class DaftarAkunListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (viewDaftar.getTextField_Username().equalsIgnoreCase("")
                        || viewDaftar.getPasswordField_Password().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(viewHome, "Data Tidak Boleh Kosong!!!");
                } else {
                    int hakAkses = 0;
                    if (viewDaftar.getComboBox_HakAkses().equals("manager")) {
                        hakAkses = 1;
                    } else {
                        hakAkses = 2;
                    }

                    modelLogin.simpan("public.\"user\"( \"idUser\", nama, password, tingkatan) VALUES "
                            + "(default, '" + viewDaftar.getTextField_Username() + "', '" + viewDaftar.getPasswordField_Password() + "', " + hakAkses + ")");
                    resetDaftar();
                    JOptionPane.showMessageDialog(viewHome, "Berhasil Mendaftar!!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_form_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class DaftarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_form_login(viewDaftar, modelLogin);
                viewHome.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_form_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class LoginHomeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_form_login(viewLogin, modelLogin);
                viewHome.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_form_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                modelLogin.getSession(viewLogin.getUser(), viewLogin.getPasswordField_Password());
                int result = modelLogin.login(viewLogin.getUser(), viewLogin.getPasswordField_Password());
                System.out.println(result);
                if (result == 1) {
                    int level = modelLogin.lvlLogin(viewLogin.getUser(), viewLogin.getPasswordField_Password());

                    if (level == 1) {
                        JOptionPane.showMessageDialog(viewLogin, "selamat Datang " + username + " !");
                        view_form_home_Manager manager = new view_form_home_Manager();
                        viewLogin.dispose();
                        manager.setVisible(true);
                        m_manager model = new m_manager(kon);
                        new c_manager(model, manager);
                    } else if (level == 2) {
                        JOptionPane.showMessageDialog(viewLogin, "selamat Datang " + username + " !");
                        view_form_home_admin admin = new view_form_home_admin();
                        viewLogin.dispose();
                        admin.setVisible(true);
                        m_admin model = new m_admin(kon);
                        new c_admin(model, admin);
                    }

                } else if ((viewLogin.getUser().equalsIgnoreCase("") || viewLogin.getPasswordField_Password().equalsIgnoreCase(""))) {
                    JOptionPane.showMessageDialog(viewLogin, "Username dan Password tidak Boleh Kosong");
                } else {
                    JOptionPane.showMessageDialog(viewLogin, "USERNAME ATAU PASSWORD ANDA SALAH !");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(viewLogin, "Koneksi time out!");
                Logger.getLogger(c_form_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
