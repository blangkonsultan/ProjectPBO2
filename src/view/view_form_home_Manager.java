/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bagas
 */
public class view_form_home_Manager extends javax.swing.JFrame {

    /**
     * Creates new form form_home_admin
     */
    public view_form_home_Manager() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane_home_Admin = new javax.swing.JTabbedPane();
        Panel_Data_Buku = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table_DataBuku = new javax.swing.JTable();
        TextField_Buku = new javax.swing.JTextField();
        Button_SearchBuku = new javax.swing.JButton();
        Button_CetakBuku = new javax.swing.JButton();
        Button_SegarkanBuku = new javax.swing.JButton();
        Panel_Data_Peminjaman = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_DataPeminjaman = new javax.swing.JTable();
        TextField_Peminjaman = new javax.swing.JTextField();
        Button_SearchPeminjaman = new javax.swing.JButton();
        Button_CetakPeminjaman = new javax.swing.JButton();
        Button_SegarkanPeminjaman = new javax.swing.JButton();
        Panel_Data_Mahasiswa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_DataMahasiswa = new javax.swing.JTable();
        TextField_cariMahasiswa = new javax.swing.JTextField();
        Button_SearchMahasiswa = new javax.swing.JButton();
        Button_CetakMahasiswa = new javax.swing.JButton();
        Button_SegarkanMahasiswa = new javax.swing.JButton();
        Button_Logout = new javax.swing.JButton();
        sessionManager = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Data_Buku.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Buku", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Panel_Data_Buku.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_DataBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID BUKU", "JUDUL BUKU", "PENGARANG", "PENERBIT", "TAHUN TERBIT", "KATEGORI"
            }
        ));
        jScrollPane4.setViewportView(Table_DataBuku);

        Panel_Data_Buku.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 46, 970, 340));

        TextField_Buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_BukuActionPerformed(evt);
            }
        });
        Panel_Data_Buku.add(TextField_Buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 210, -1));

        Button_SearchBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        Button_SearchBuku.setBorderPainted(false);
        Button_SearchBuku.setContentAreaFilled(false);
        Panel_Data_Buku.add(Button_SearchBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 20, 20));

        Button_CetakBuku.setText("Cetak Laporan");
        Button_CetakBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Button_CetakBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CetakBukuActionPerformed(evt);
            }
        });
        Panel_Data_Buku.add(Button_CetakBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 30));

        Button_SegarkanBuku.setText("Segarkan");
        Button_SegarkanBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Data_Buku.add(Button_SegarkanBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 100, 30));

        TabbedPane_home_Admin.addTab("Data Buku", Panel_Data_Buku);

        Panel_Data_Peminjaman.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Peminjaman", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Panel_Data_Peminjaman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jPanel1.setPreferredSize(new java.awt.Dimension(970, 471));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Table_DataPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NIM", "NAMA", "FAKUTAS", "ID BUKU", "JUDUL BUKU", "KATEGORI", "TANGGAL PINJAM", "TANGGAL PENGEMBALIAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_DataPeminjaman.setPreferredSize(new java.awt.Dimension(1300, 470));
        jScrollPane3.setViewportView(Table_DataPeminjaman);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 330));

        jScrollPane2.setViewportView(jPanel1);

        Panel_Data_Peminjaman.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 970, 340));

        TextField_Peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PeminjamanActionPerformed(evt);
            }
        });
        Panel_Data_Peminjaman.add(TextField_Peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 210, -1));

        Button_SearchPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        Button_SearchPeminjaman.setBorderPainted(false);
        Button_SearchPeminjaman.setContentAreaFilled(false);
        Panel_Data_Peminjaman.add(Button_SearchPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 20, 20));

        Button_CetakPeminjaman.setText("Cetak Laporan");
        Button_CetakPeminjaman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Button_CetakPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CetakPeminjamanActionPerformed(evt);
            }
        });
        Panel_Data_Peminjaman.add(Button_CetakPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 30));

        Button_SegarkanPeminjaman.setText("Segarkan");
        Button_SegarkanPeminjaman.setToolTipText("");
        Button_SegarkanPeminjaman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Data_Peminjaman.add(Button_SegarkanPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 100, 30));

        TabbedPane_home_Admin.addTab("Data Peminjaman", Panel_Data_Peminjaman);

        Panel_Data_Mahasiswa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Mahasiswa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Panel_Data_Mahasiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_DataMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "FAKULTAS", "TEMPAT LAHIR", "TANGGAL LAHIR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table_DataMahasiswa);

        Panel_Data_Mahasiswa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 970, 340));

        TextField_cariMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_cariMahasiswaActionPerformed(evt);
            }
        });
        Panel_Data_Mahasiswa.add(TextField_cariMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 210, -1));

        Button_SearchMahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        Button_SearchMahasiswa.setBorderPainted(false);
        Button_SearchMahasiswa.setContentAreaFilled(false);
        Panel_Data_Mahasiswa.add(Button_SearchMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 20, 20));

        Button_CetakMahasiswa.setText("Cetak Laporan");
        Button_CetakMahasiswa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Button_CetakMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CetakMahasiswaActionPerformed(evt);
            }
        });
        Panel_Data_Mahasiswa.add(Button_CetakMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 120, 30));

        Button_SegarkanMahasiswa.setText("Segarkan");
        Button_SegarkanMahasiswa.setToolTipText("");
        Button_SegarkanMahasiswa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Data_Mahasiswa.add(Button_SegarkanMahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 100, 30));

        TabbedPane_home_Admin.addTab("Data Mahasiswa", Panel_Data_Mahasiswa);

        getContentPane().add(TabbedPane_home_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1004, 470));

        Button_Logout.setText("Logout");
        Button_Logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Button_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 70, -1));

        sessionManager.setText(" ");
        getContentPane().add(sessionManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 50, -1));

        jLabel1.setText("Manager :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/form_home_admin.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getSessionManager() {
        return sessionManager.getText();
    }

    public void setSessionManager(String sessionManager) {
        this.sessionManager.setText(sessionManager);
    }

    public void setTabelBuku(DefaultTableModel tabel) {
        this.Table_DataBuku.setModel(tabel);
    }

    public void setTabelMahasiswa(DefaultTableModel tabel) {
        this.Table_DataMahasiswa.setModel(tabel);
    }

    public void setTabelPeminjaman(DefaultTableModel tabel) {
        this.Table_DataPeminjaman.setModel(tabel);
    }

    public void CetakBukuListener(ActionListener l) {
        this.Button_CetakBuku.addActionListener(l);
    }

    public void CetakMahasiswaListener(ActionListener l) {
        this.Button_CetakMahasiswa.addActionListener(l);
    }

    public void CetakPeminjamanListener(ActionListener l) {
        this.Button_CetakPeminjaman.addActionListener(l);
    }

    public void logoutListener(ActionListener l) {
        this.Button_Logout.addActionListener(l);
    }

    public void SearchBukuListener(ActionListener l) {
        this.Button_SearchBuku.addActionListener(l);
    }

    public void SearchMahasiswaListener(ActionListener l) {
        this.Button_SearchMahasiswa.addActionListener(l);
    }

    public void SearchPeminjamanListener(ActionListener l) {
        this.Button_SearchPeminjaman.addActionListener(l);
    }

    public void SegarkanBukuListener(ActionListener l) {
        this.Button_SegarkanBuku.addActionListener(l);
    }

    public void SegarkanMahasiswaListener(ActionListener l) {
        this.Button_SegarkanMahasiswa.addActionListener(l);
    }

    public void SegarkanPeminjamanListener(ActionListener l) {
        this.Button_SegarkanPeminjaman.addActionListener(l);
    }
    private void TextField_BukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_BukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_BukuActionPerformed

    private void TextField_PeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PeminjamanActionPerformed

    private void TextField_cariMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_cariMahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_cariMahasiswaActionPerformed

    private void Button_CetakBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CetakBukuActionPerformed
        new view_dialog_cetakLaporanBuku(this, rootPaneCheckingEnabled).setVisible(true);

    }//GEN-LAST:event_Button_CetakBukuActionPerformed

    private void Button_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LogoutActionPerformed
//        new view_form_login().setVisible(true);
//        dispose();
    }//GEN-LAST:event_Button_LogoutActionPerformed

    private void Button_CetakPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CetakPeminjamanActionPerformed
        new view_dialog_cetakLaporanPeminjaman(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_Button_CetakPeminjamanActionPerformed

    private void Button_CetakMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CetakMahasiswaActionPerformed
        new view_dialog_cetakLaporanMahasiswa(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_Button_CetakMahasiswaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(view_form_home_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(view_form_home_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(view_form_home_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(view_form_home_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new view_form_home_Manager().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_CetakBuku;
    private javax.swing.JButton Button_CetakMahasiswa;
    private javax.swing.JButton Button_CetakPeminjaman;
    private javax.swing.JButton Button_Logout;
    private javax.swing.JButton Button_SearchBuku;
    private javax.swing.JButton Button_SearchMahasiswa;
    private javax.swing.JButton Button_SearchPeminjaman;
    private javax.swing.JButton Button_SegarkanBuku;
    private javax.swing.JButton Button_SegarkanMahasiswa;
    private javax.swing.JButton Button_SegarkanPeminjaman;
    private javax.swing.JPanel Panel_Data_Buku;
    private javax.swing.JPanel Panel_Data_Mahasiswa;
    private javax.swing.JPanel Panel_Data_Peminjaman;
    private javax.swing.JTabbedPane TabbedPane_home_Admin;
    private javax.swing.JTable Table_DataBuku;
    private javax.swing.JTable Table_DataMahasiswa;
    private javax.swing.JTable Table_DataPeminjaman;
    private javax.swing.JTextField TextField_Buku;
    private javax.swing.JTextField TextField_Peminjaman;
    private javax.swing.JTextField TextField_cariMahasiswa;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel sessionManager;
    // End of variables declaration//GEN-END:variables
}
