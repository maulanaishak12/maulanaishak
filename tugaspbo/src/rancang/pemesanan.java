/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author ACER
 */
public class pemesanan {
  private String idpemesanan;
    private String idpelanggan;
    private String idvendor;
    private String jumlahtamu;
    private String tanggalresepsi;
 
    public pemesanan() {}

    public pemesanan(String idpemesanan, String idpelanggan, String idvendor, String jumlahtamu, String tanggalresepsi) {
        this.idpemesanan = idpemesanan;
        this.idpelanggan = idpelanggan;
        this.idvendor = idvendor;
        this.jumlahtamu = jumlahtamu;
        this.tanggalresepsi = tanggalresepsi;
    }

    public String getpemesanan() {
        return idpemesanan;
    }

    public void setidpemesanan(String idpemesanan) {
        this.idpemesanan = idpemesanan;
    }

    public String getidpelanggan() {
        return idpelanggan;
    }

    public void setidpelanggan(String idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public String getidvendor() {
        return idvendor;
    }

    public void setidvendor(String idvendor) {
        this.idvendor = idvendor;
    }

    public String getjumlahtamu() {
        return jumlahtamu;
    }

    public void setjumlahtamu(String jumlahtamu) {
        this.jumlahtamu = jumlahtamu;
    }
    
    public String gettanggalresepsi() {
        return tanggalresepsi;
    }

    public void settanggalresepsi(String tanggalresepsi) {
        this.tanggalresepsi = tanggalresepsi;
    }

    public void cetakinfopemesanan() {
        System.out.println("ID PEMESANAN : " + idpemesanan);
        System.out.println("ID PELANGGAN: " + idpelanggan);
        System.out.println("ID VENDOR: " + idvendor);
        System.out.println("JUMLAH TAMU: " + jumlahtamu);
        System.out.println("TANGGAL RESEPSI: " + tanggalresepsi);        
    }
}  

