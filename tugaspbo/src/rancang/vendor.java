/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author ACER
 */
public class vendor {
   private String idvendor;
    private String namavendor;
    private String pemilikvendor;
    private String telpvendor;
    private String alamat;
 
    public vendor() {}

    public vendor(String idvendor, String namavendor, String pemilikvendor, String telpvendor, String alamat) {
        this.idvendor = idvendor;
        this.namavendor = namavendor;
        this.pemilikvendor = pemilikvendor;
        this.telpvendor = telpvendor;
        this.alamat = alamat;
    }

    public String getvendor() {
        return idvendor;
    }

    public void setidvendor(String idvendor) {
        this.idvendor = idvendor;
    }

    public String getnamavendor() {
        return namavendor;
    }

    public void setnamavendor(String namavendor) {
        this.namavendor = namavendor;
    }

    public String getpemilikvendor() {
        return pemilikvendor;
    }

    public void setpelikvendor(String pemilikvendor) {
        this.pemilikvendor = pemilikvendor;
    }

    public String gettelpvendor() {
        return telpvendor;
    }

    public void settelpvendor(String telpvendor) {
        this.telpvendor = telpvendor;
    }
    
    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetakinfovendor() {
        System.out.println("ID VENDOR : " + idvendor);
        System.out.println("NAMA VENDOR: " + namavendor);
        System.out.println("PEMILIK VENDOR: " + pemilikvendor);
        System.out.println("TELP VENDOR: " + telpvendor);
        System.out.println("ALAMAT: " + alamat);        
    }
}  

