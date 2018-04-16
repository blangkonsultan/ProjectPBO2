/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode;

/**
 *
 * @author Bagas
 */
public class dialog_kelolaMahasiswa extends java.awt.Dialog {

    /**
     * Creates new form dialog_kelolaBuku
     */
    public dialog_kelolaMahasiswa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextField_TempatLahir = new javax.swing.JTextField();
        TextField_NIM = new javax.swing.JTextField();
        TextField_NamaLengkap = new javax.swing.JTextField();
        Button_Perbarui = new javax.swing.JButton();
        Button_Simpan = new javax.swing.JButton();
        Button_Hapus = new javax.swing.JButton();
        Button_Segarkan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ComboBox_Fakultas = new javax.swing.JComboBox<>();
        DateChooser_TanggalLahir = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_DataMahasiswa = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setResizable(false);
        setSize(new java.awt.Dimension(900, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NIM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Lengkap");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Fakultas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tempat Lahir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(TextField_TempatLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, -1));
        jPanel1.add(TextField_NIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, -1));
        jPanel1.add(TextField_NamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 160, -1));

        Button_Perbarui.setText("Perbarui");
        jPanel1.add(Button_Perbarui, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        Button_Simpan.setText("Simpan");
        jPanel1.add(Button_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, -1));

        Button_Hapus.setText("Hapus");
        jPanel1.add(Button_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 80, -1));

        Button_Segarkan.setText("Segarkan");
        jPanel1.add(Button_Segarkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tanggal Lahir");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        ComboBox_Fakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fakultas Ilmu Komputer", "Fakultas Teknik", "Fakultas Kedokteran", " " }));
        jPanel1.add(ComboBox_Fakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 160, -1));
        jPanel1.add(DateChooser_TanggalLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 320));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

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
        jScrollPane2.setViewportView(Table_DataMahasiswa);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 500, 320));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg_kelolaMahasiswa.png"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog_kelolaMahasiswa dialog = new dialog_kelolaMahasiswa(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Button_Hapus;
    private javax.swing.JButton Button_Perbarui;
    private javax.swing.JButton Button_Segarkan;
    private javax.swing.JButton Button_Simpan;
    private javax.swing.JComboBox<String> ComboBox_Fakultas;
    private com.toedter.calendar.JDateChooser DateChooser_TanggalLahir;
    private javax.swing.JTable Table_DataMahasiswa;
    private javax.swing.JTextField TextField_NIM;
    private javax.swing.JTextField TextField_NamaLengkap;
    private javax.swing.JTextField TextField_TempatLahir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
