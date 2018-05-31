/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bagas
 */
public class m_admin extends basemodel {

    koneksi kon;
//    public String status;

    public m_admin(koneksi kon) throws SQLException {
        super();
        this.kon = new koneksi("postgres", "2796", "Perpustakaan");
    }

    @Override
    public boolean simpan(String query) throws SQLException {
        String queri = "INSERT INTO "+query;
        System.out.println(queri);
        return super.save(queri);
    }

    @Override
    public boolean perbarui(String query) throws SQLException {
        String queri = "UPDATE " + query;
        System.out.println(queri);
        return super.update(queri);
    }

    @Override
    public boolean hapus(String query) throws SQLException {
        String queri = "DELETE FROM " + query ;
        System.out.println(queri);
        return super.delete(queri);
    }

    public DefaultTableModel getTableModelBuku() throws SQLException {
        Object[] header = {"idBuku", "Kode Buku", "Judul Buku", "Pengarang", "Penerbit", "Tahun Terbit", "Kategori", "Stok"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "SELECT b.idbuku, b.kode, b.judul, b.pengarang, b.penerbit, b.rilis, k.namakategori, b.stok\n"
                + "	FROM public.buku b join kategori k on b.idkategori = k.idkategori";
        System.out.println(sql);
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[8];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

    public DefaultTableModel getTableModelMahasiswa() throws SQLException {
        Object[] header = {"idMahasiswa", "NIM", "Nama", "Fakultas", "Tempat Lahir", "Tanggal Lahir"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "SELECT m.idmahasiswa, m.nim, m.nama, f.fakultas, m.\"tempatLahir\", m.\"tanggalLahir\" \n"
                + "	FROM public.mahasiswa m join namafakultas f on m.idfakultas = f.idfakultas";
        System.out.println(sql);
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        ResultSet rs = kon.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[6];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tableModel.addRow(kolom);
        }
        return tableModel;
    }

    public String[] comboKategori() throws SQLException {
        String query = "SELECT namakategori FROM public.kategori";
        String db = "Perpustakaan";
        String username = "postgres";
        String password = "2796";
        String url = "jdbc:postgresql://localhost:5432/" + db;
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        Statement stmq = con.createStatement();
        ResultSet rs = stmt.executeQuery();
        rs.getRow();
        rs.last();
        String kategori[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            kategori[a] = rs.getString("namakategori");
            a++;
        }
        return kategori;
    }

    public String[] comboFakultas() throws SQLException {
        String query = "SELECT fakultas FROM public.namafakultas";
        String db = "Perpustakaan";
        String username = "postgres";
        String password = "2796";
        String url = "jdbc:postgresql://localhost:5432/" + db;
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = con.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        Statement stmq = con.createStatement();
        ResultSet rs = stmt.executeQuery();
        rs.getRow();
        rs.last();
        String kategori[] = new String[rs.getRow()];
        rs.beforeFirst();
        int a = 0;
        while (rs.next()) {
            kategori[a] = rs.getString("fakultas");
            a++;
        }
        return kategori;
    }

}
