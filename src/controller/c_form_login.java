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
import view.view_form_home_Manager;
import view.view_form_home_admin;
import view.view_form_login;

public class c_form_login {

    private view.view_form_login viewLogin;
    private model.m_login modelLogin;
   private static String username;
    private koneksi kon;

    public c_form_login(view_form_login viewLogin, m_login modelLogin) {
        this.viewLogin = viewLogin;
        this.modelLogin = modelLogin;

        viewLogin.setVisible(true);
        viewLogin.loginListener(new LoginListener());
    }

    public static void setUserLogin(String username) {
        c_form_login.username = username;
    }

    public static String getUserLogin() {
        return username;
    }

    private class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
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
