/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author ACER
 */
public class pembayaran {
    private String idpembayaran;
    private String status;
    private String idpesanan;
    private String totalpembayaran;
 
    public pembayaran() {}

    public pembayaran(String idpembayaran, String status, String idpesanan, String totalpembayaran) {
        this.idpembayaran = idpembayaran;
        this.status = status;
        this.idpesanan = idpesanan;
        this.totalpembayaran = totalpembayaran;
    }

    public String getpembayaran() {
        return idpembayaran;
    }

    public void setidpembayaran(String idpembayaran) {
        this.idpembayaran = idpembayaran;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public String getidpesanan() {
        return idpesanan;
    }

    public void setidpesanan(String idpesanan) {
        this.idpesanan = idpesanan;
    }

    public String gettotalpembayaran() {
        return totalpembayaran;
    }

    public void settipe(String totalpembayaran) {
        this.totalpembayaran = totalpembayaran;
    }

    public void cetakinfopembayaran() {
        System.out.println("ID  PEMBAYARAN : " + idpembayaran);
        System.out.println("STATUS: " + status);
        System.out.println("ID PESANAN: " + idpesanan);
        System.out.println("TOTAL PEMBAYARAN: " + totalpembayaran);
        
    }
}


