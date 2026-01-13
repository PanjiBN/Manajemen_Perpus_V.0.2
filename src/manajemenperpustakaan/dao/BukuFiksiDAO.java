/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import manajemenperpustakaan.config.Database;
import manajemenperpustakaan.model.BukuFiksi;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Panji
 */
public class BukuFiksiDAO {
    public boolean insert (BukuFiksi bukufiksi){
        String sql = "INSERT INTO bukufiksi (judul, pengarang, penerbit, genre, deskripsi,"
                + "dapatDipinjam, sedangDipinjam) VALUES (?,?,?,?,?,?,?)";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, bukufiksi.getJudul());
            ps.setString(2, bukufiksi.getPengarang());
            ps.setString(3, bukufiksi.getPenerbit());
            ps.setString(4, bukufiksi.getGenre());
            ps.setString(5, bukufiksi.getDeskripsi());
            ps.setInt(6, bukufiksi.getDapatDipinjam());
            ps.setInt(7, bukufiksi.getSedangDipinjam());
            ps.executeUpdate();
            
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<BukuFiksi> getAll() {
        List<BukuFiksi> list = new ArrayList<>();
        String sql = "SELECT * FROM bukufiksi";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                BukuFiksi bukufiksi = new BukuFiksi(
                    rs.getInt("id"),
                    rs.getString("judul"),
                    rs.getString("pengarang"),
                    rs.getString("penerbit"),
                    rs.getString("genre"),
                    rs.getString("deskripsi"),
                    rs.getInt("dapatDipinjam"),
                    rs.getInt("sedangDipinjam")
                );
                list.add(bukufiksi);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean update(BukuFiksi bukufiksi) {
        String sql = "UPDATE bukufiksi SET judul=?, pengarang=?, penerbit=?, genre=?, deskripsi=?,"
                + "dapatDipinjam=?, sedangDipinjam=? WHERE id=?";
        
        try (Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, bukufiksi.getJudul());
            ps.setString(2, bukufiksi.getPengarang());
            ps.setString(3, bukufiksi.getPenerbit());
            ps.setString(4, bukufiksi.getGenre());
            ps.setString(5, bukufiksi.getDeskripsi());
            ps.setInt(6, bukufiksi.getDapatDipinjam());
            ps.setInt(7, bukufiksi.getSedangDipinjam());
            ps.setInt(8, bukufiksi.getIdBuku());
            ps.executeUpdate();
            
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(int id){
        String sql = "DELETE FROM bukufiksi WHERE id=?";
        
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
    
    public BukuFiksi getById(int id){
        BukuFiksi bukufiksi = null;
        String sql = "SELECT * FROM bukufiksi WHERE id=?";
        try(Connection conn = Database.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                bukufiksi = new BukuFiksi(
                rs.getInt("id"),
                rs.getString("judul"),
                rs.getString("pengarang"),
                rs.getString("penerbit"),
                rs.getString("genre"),
                rs.getString("deskripsi"),
                rs.getInt("dapatDipinjam"),
                rs.getInt("sedangDipinjam"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return bukufiksi;
    }
}
