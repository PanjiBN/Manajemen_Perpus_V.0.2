/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenperpustakaan.model;

/**
 *
 * @author Panji
 */
public class Buku {
    protected int idBuku;
    protected String judul;
    protected String pengarang;
    protected String penerbit;
    protected String deskripsi;
    protected int dapatDipinjam;
    protected int sedangDipinjam;
    
    public Buku(){
        
    }
    public Buku(int idBuku, String judul, String pengarang, String penerbit, String deskripsi, int dapatDipinjam, int sedangDipinjam){
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.deskripsi = deskripsi;
        this.dapatDipinjam = dapatDipinjam;
        this.sedangDipinjam = sedangDipinjam;
    }
    
    public int getIdBuku() {
        return idBuku;
    }
    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public int getDapatDipinjam() {
        return dapatDipinjam;
    }
    public void setDapatDipinjam(int dapatDipinjam) {
        this.dapatDipinjam = dapatDipinjam;
    }
    public int getSedangDipinjam() {
        return sedangDipinjam;
    }
    public void setSedangDipinjam(int sedangDipinjam) {
        this.sedangDipinjam = sedangDipinjam;
    }
    public String getInfoBuku(){
        return "Id buku\t: " + idBuku + "\n" 
        + "Judul buku\t: " + judul + "\n" 
        + "Pengarang buku\t: " + pengarang + "\n"
        + "Penerbit buku\t: " + penerbit + "\n"
        + "Deskripsi buku\t: " + deskripsi + "\n"
        + "Buku yang bisa dipinjam: " + dapatDipinjam + "\n"
        + "Buku yang sedang dipinjam: " + sedangDipinjam + "\n";
    }
}
