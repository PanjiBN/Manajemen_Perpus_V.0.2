/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan.model;

/**
 *
 * @author Panji
 */
public class BukuNonFiksi extends Buku {
    private String kategori;
    
    public BukuNonFiksi(){
        
    }
    public BukuNonFiksi(int idBuku, String judul, String pengarang, String penerbit, String kategori, String deskripsi,
            int dapatDipinjam, int sedangDipinjam){
        super(idBuku, judul, pengarang, penerbit, deskripsi, dapatDipinjam, sedangDipinjam);
        this.kategori = kategori;
    }
    
    public String getKategori() {
        return kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    @Override
    public String getInfoBuku(){
        return "Id buku\t: " + idBuku + "\n" 
        + "Judul buku\t: " + judul + "\n" 
        + "Pengarang buku\t: " + pengarang + "\n"
        + "Penerbit buku\t: " + penerbit + "\n"
        + "Kategori buku\t: " + kategori + "\n"
        + "Deskripsi buku\t: " + deskripsi + "\n"
        + "Buku yang bisa dipinjam: " + dapatDipinjam + "\n"
        + "Buku yang sedang dipinjam: " + sedangDipinjam + "\n";
    }
}
