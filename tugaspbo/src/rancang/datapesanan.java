/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author ACER
 */
public class datapesanan {
    private String idkonten;
    private String idvendor;
    private String namakonten;
    private String tipe;
    private String harga;
    public datapesanan() {}

    public datapesanan(String idkonten, String idvendor, String namakonten, String tipe, String harga) {
        this.idkonten = idkonten;
        this.idvendor = idvendor;
        this.namakonten = namakonten;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getkonten() {
        return idkonten;
    }

    public void setidkonten(String idkonten) {
        this.idkonten = idkonten;
    }

    public String getidvendor() {
        return idvendor;
    }

    public void setidvendor(String idvendor) {
        this.idvendor = idvendor;
    }

    public String getnamakonten() {
        return namakonten;
    }

    public void setnamakonten(String namakonten) {
        this.namakonten = namakonten;
    }

    public String gettipe() {
        return tipe;
    }

    public void settipe(String tipe) {
        this.tipe = tipe;
    }
    
    public String getharga() {
        return harga;
    }

    public void setharga(String harga) {
        this.harga = harga;
    }

    public void cetakinfodatapesanan() {
        System.out.println("ID  KONTEN : " + idkonten);
        System.out.println("ID VENDOR: " + idvendor);
        System.out.println("NAMA KONTEN: " + namakonten);
        System.out.println("TIPE: " + tipe);
        System.out.println("HARGA: " + harga);
        
    }
}

