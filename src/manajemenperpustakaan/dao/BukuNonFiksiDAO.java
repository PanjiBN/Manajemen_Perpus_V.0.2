/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import manajemenperpustakaan.config.Database;
import manajemenperpustakaan.model.BukuNonFiksi;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Panji
 */
public class BukuNonFiksiDAO {
    public boolean insert (BukuNonFiksi bukunonfiksi){
        String sql = "INSERT INTO bukunonfiksi (judul, pengarang, penerbit, kategori, deskripsi,"
                + "dapatDipinjam, sedangDipinjam) VALUES (?,?,?,?,?,?,?)";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, bukunonfiksi.getJudul());
            ps.setString(2, bukunonfiksi.getPengarang());
            ps.setString(3, bukunonfiksi.getPenerbit());
            ps.setString(4, bukunonfiksi.getKategori());
            ps.setString(5, bukunonfiksi.getDeskripsi());
            ps.setInt(6, bukunonfiksi.getDapatDipinjam());
            ps.setInt(7, bukunonfiksi.getSedangDipinjam());
            ps.executeUpdate();
            
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<BukuNonFiksi> getAll() {
        List<BukuNonFiksi> list = new ArrayList<>();
        String sql = "SELECT * FROM bukunonfiksi";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                BukuNonFiksi bukunonfiksi = new BukuNonFiksi(
                    rs.getInt("id"),
                    rs.getString("judul"),
                    rs.getString("pengarang"),
                    rs.getString("penerbit"),
                    rs.getString("kategori"),
                    rs.getString("deskripsi"),
                    rs.getInt("dapatDipinjam"),
                    rs.getInt("sedangDipinjam")
                );
                list.add(bukunonfiksi);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean update(BukuNonFiksi bukunonfiksi) {
        String sql = "UPDATE bukunonfiksi SET judul=?, pengarang=?, penerbit=?, kategori=?, deskripsi=?,"
                + "dapatDipinjam=?, sedangDipinjam=? WHERE id=?";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, bukunonfiksi.getJudul());
            ps.setString(2, bukunonfiksi.getPengarang());
            ps.setString(3, bukunonfiksi.getPenerbit());
            ps.setString(4, bukunonfiksi.getKategori());
            ps.setString(5, bukunonfiksi.getDeskripsi());
            ps.setInt(6, bukunonfiksi.getDapatDipinjam());
            ps.setInt(7, bukunonfiksi.getSedangDipinjam());
            ps.setInt(8, bukunonfiksi.getIdBuku());
            ps.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(int id){
        String sql = "DELETE FROM bukunonfiksi WHERE id=?";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public BukuNonFiksi getById(int id){
        BukuNonFiksi bukunonfiksi = null;
        String sql = "SELECT * FROM bukunonfiksi WHERE id=?";
        try(Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                bukunonfiksi = new BukuNonFiksi(
                rs.getInt("id"),
                rs.getString("judul"),
                rs.getString("pengarang"),
                rs.getString("penerbit"),
                rs.getString("kategori"),
                rs.getString("deskripsi"),
                rs.getInt("dapatDipinjam"),
                rs.getInt("sedangDipinjam"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return bukunonfiksi;
    }
}
