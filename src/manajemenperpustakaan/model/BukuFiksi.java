/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan.model;

/**
 *
 * @author Panji
 */
public class BukuFiksi extends Buku {
    private String genre;
    
    public BukuFiksi(){
        
    }
    public BukuFiksi(int idBuku, String judul, String pengarang, String penerbit, String genre, String deskripsi,
            int dapatDipinjam, int sedangDipinjam){
        super(idBuku, judul, pengarang, penerbit, deskripsi, dapatDipinjam, sedangDipinjam);
        this.genre = genre;
    }
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String getInfoBuku(){
        return "Id buku\t: " + idBuku + "\n" 
        + "Judul buku\t: " + judul + "\n" 
        + "Pengarang buku\t: " + pengarang + "\n"
        + "Penerbit buku\t: " + penerbit + "\n"
        + "Genre buku\t: " + genre + "\n"
        + "Deskripsi buku\t: " + deskripsi + "\n"
        + "Buku yang bisa dipinjam: " + dapatDipinjam + "\n"
        + "Buku yang sedang dipinjam: " + sedangDipinjam + "\n";
    }
}
