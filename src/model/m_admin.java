/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.c_admin;
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
        String queri = "INSERT INTO " + query;
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
        String queri = "DELETE FROM " + query;
        System.out.println(queri);
        return super.delete(queri);
    }

    public DefaultTableModel getTableModelPeminjaman() throws SQLException {
        Object[] header = {"id Peminjaman", "NIM", "Nama", "Fakultas", "Kode Buku", "Tanggal Pinjam", "Tanggal Pengembalian", "Status"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "SELECT p.\"idPeminjaman\",m.NIM, m.nama, f.fakultas, b.kode, p.\"tanggalPinjam\", p.\"tanggalPengembalian\", s.status\n"
                + "	FROM public.peminjaman p join mahasiswa m on p.idmahasiswa = m.idmahasiswa join namafakultas f on m.idfakultas = f.idfakultas join\n"
                + "	buku b on b.idbuku = p.\"idBuku\" join statuspinjam s on s.idstatus = p.status;";
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

    public DefaultTableModel getTableModelPeminjamanCari(String query) throws SQLException {
        Object[] header = {"id Peminjaman", "NIM", "Nama", "Fakultas", "Kode Buku", "Tanggal Pinjam", "Tanggal Pengembalian", "Status"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "SELECT p.\"idPeminjaman\",m.NIM, m.nama, f.fakultas, b.kode, p.\"tanggalPinjam\", p.\"tanggalPengembalian\", s.status\n"
                + "	FROM public.peminjaman p join mahasiswa m on p.idmahasiswa = m.idmahasiswa join namafakultas f on m.idfakultas = f.idfakultas join\n"
                + "	buku b on b.idbuku = p.\"idBuku\" join statuspinjam s on s.idstatus = p.status where m.NIM =" + query;
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

    public DefaultTableModel getTableModelBukuCari(String query) throws SQLException {
        Object[] header = {"idBuku", "Kode Buku", "Judul Buku", "Pengarang", "Penerbit", "Tahun Terbit", "Kategori", "Stok"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "SELECT b.idbuku, b.kode, b.judul, b.pengarang, b.penerbit, b.rilis, k.namakategori, b.stok\n"
                + "	FROM public.buku b join kategori k on b.idkategori = k.idkategori where b.kode = " + query;
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

    public DefaultTableModel getTableModelMahasiswaCari(String query) throws SQLException {
        Object[] header = {"idMahasiswa", "NIM", "Nama", "Fakultas", "Tempat Lahir", "Tanggal Lahir"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);

        String sql = "SELECT m.idmahasiswa, m.nim, m.nama, f.fakultas, m.\"tempatLahir\", m.\"tanggalLahir\" \n"
                + "	FROM public.mahasiswa m join namafakultas f on m.idfakultas = f.idfakultas where nim = " + query;
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

    public String[] comboStatusPinjaman() throws SQLException {
        String query = "SELECT status FROM public.statuspinjam";
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
            kategori[a] = rs.getString("status");
            a++;
        }
        return kategori;
    }

    public void getidBuku(String kodeBuku) throws SQLException {
        String query = "SELECT idbuku FROM public.buku \n"
                + "where kode = '" + kodeBuku + "';";
        System.out.println("geti id query : " + query);
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
            c_admin.setidBuku(rs.getString("idbuku"));
        }

    }

    public void getidMahasiswa(String NIM) throws SQLException {
        String query = "SELECT idmahasiswa FROM public.mahasiswa\n"
                + "where nim = '" + NIM + "';";
        ResultSet rs = kon.getResult(query);
        System.out.println("get id mahasiswa :" + query);
        while (rs.next()) {
            c_admin.setidMahasiswa(rs.getString("idmahasiswa"));
        }

    }

    public int cekDuplikatNIM(String NIM) throws SQLException {
        int result = 0;
        String query = "SELECT idmahasiswa, nama, \"tempatLahir\", \"tanggalLahir\", nim, idfakultas, \"user\" \n"
                + "FROM public.mahasiswa where nim ='" + NIM + "'";
        ResultSet rs = kon.getResult(query);
        rs.last();
        result = rs.getRow();
        return result;

    }

    public int cekDataBukuada(String kode) throws SQLException {
        int result = 0;
        String query = "SELECT idbuku, kode, judul, pengarang, penerbit, stok, rilis, idkategori, \"user\"\n"
                + "FROM public.buku where kode = '" + kode + "'";
        ResultSet rs = kon.getResult(query);
        rs.last();
        result = rs.getRow();
        return result;

    }
}
