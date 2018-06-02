/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Bagas
 */
public class view_form_daftar extends javax.swing.JFrame {

    /**
     * Creates new form view_form_daftar
     */
    public view_form_daftar() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public String getPasswordField_Password() {
        String pass = "";
        char passArray[] = this.PasswordField_Password.getPassword();
        for (int i = 0; i < passArray.length; i++) {
            pass += passArray[i];
        }

        return pass;
    }

    public void setPasswordField_Password(String PasswordField_Password) {
        this.PasswordField_Password.setText(PasswordField_Password);
    }

    public String getTextField_Username() {
        return TextField_Username.getText();
    }

    public void setTextField_Username(String TextField_Username) {
        this.TextField_Username.setText(TextField_Username);
    }

    public void DaftarAkunListener(ActionListener l) {
        this.Button_Daftar.addActionListener(l);
    }
    
    public void kembaliDaftarListener(ActionListener l) {
        this.Button_kembali.addActionListener(l);
    }

    public void setComboBox_HakAkses(String[] ComboBox_KategoriBuku) {
        for (String a : ComboBox_KategoriBuku) {
            this.ComboBox_HakAkses.addItem(a);
        }
    }

    public String getComboBox_HakAkses() {
        return ComboBox_HakAkses.getSelectedItem().toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_Username = new javax.swing.JTextField();
        PasswordField_Password = new javax.swing.JPasswordField();
        ComboBox_HakAkses = new javax.swing.JComboBox<>();
        Button_Daftar = new javax.swing.JButton();
        Button_kembali = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel2.setText("Password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel3.setText("Hak Akses :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));
        getContentPane().add(TextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 150, -1));
        getContentPane().add(PasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 150, -1));

        getContentPane().add(ComboBox_HakAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 80, -1));

        Button_Daftar.setText("Daftar");
        getContentPane().add(Button_Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        Button_kembali.setText("kembali");
        getContentPane().add(Button_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/form_home_admin.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Daftar;
    private javax.swing.JButton Button_kembali;
    private javax.swing.JComboBox<String> ComboBox_HakAkses;
    private javax.swing.JPasswordField PasswordField_Password;
    private javax.swing.JTextField TextField_Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
