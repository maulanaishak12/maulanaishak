/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ACER
 */
public class database {
    private String database = "2210010137";
    private String username = "root";
    private String password = "";

    public Connection konekdb;

    public database() {
        try {
            String url = "jdbc:mysql://localhost/" + this.database;
            Class.forName("com.mysql.jdbc.Driver");
            konekdb = DriverManager.getConnection(url, username, password);
            System.out.println("Database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void simpandatapesanan(String idkonten, String idvendor, String namakonten, String tipe, String harga) {
        try {
            String SQL = "INSERT INTO datapesanan (id_konten, id_vendor, namakonten, tipe, harga) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idkonten);
            perintah.setString(2, idvendor);
            perintah.setString(3, namakonten);
            perintah.setString(4, tipe);
            perintah.setString(5, harga);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahdatapesanan(String idkonten, String idvendor, String namakonten, String tipe, String harga) {
        try {
            String SQL = "UPDATE datapesanan SET id_vendor = ?, namakonten = ?, tipe = ?, harga =? WHERE id_konten = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idvendor);
            perintah.setString(2, namakonten);
            perintah.setString(3, tipe);
            perintah.setString(4, harga);
             perintah.setString(5, idkonten);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapusdatapesanan(String idkonten) {
        try {
            String SQL = "DELETE FROM datapesanan WHERE id_konten = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idkonten);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void simpanpembayaran(String idpembayaran, String status, String idpesanan, String totalpembayaran) {
        try {
            String SQL = "INSERT INTO pembayaran (id_pembayaran, status, id_pesanan, totalpembayaran) VALUES (?, ?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idpembayaran);
            perintah.setString(2, status);
            perintah.setString(3, idpesanan);
            perintah.setString(4, totalpembayaran);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ubahpembayaran(String idpembayaran, String status, String idpesanan, String totalpembayaran) {
        try {
            String SQL = "UPDATE pembayaran SET status = ?, id_pesanan = ?, totalpembayaran = ? WHERE id_pembayaran = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, status);
            perintah.setString(2, idpesanan);
            perintah.setString(3, totalpembayaran);
            perintah.setString(4, idpesanan);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void hapuspembayaran(String idpembayaran) {
        try {
            String SQL = "DELETE FROM pembayaran WHERE id_pembayaran = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idpembayaran);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanpemesanan(String idpemesanan, String idpelanggan, String idvendor, String jumlahtamu, String tanggalresepsi) {
        try {
            String SQL = "INSERT INTO pemesanan (id_pemesanan, id_pelanggan, id_vendor, jumlahtamu, tanggalresepsi) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idpemesanan);
            perintah.setString(2, idpelanggan);
            perintah.setString(3, idvendor);
            perintah.setString(4, jumlahtamu);
            perintah.setString(5, tanggalresepsi);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

 public void ubahpemesanan(String idpemesanan, String idpelanggan, String idvendor, String jumlahtamu, String tanggalresepsi) {
    try {
        String SQL = "UPDATE pemesanan SET id_pelanggan = ?, id_vendor = ?, jumlahtamu = ?, tanggalresepsi = ? WHERE id_pemesanan = ?";
        PreparedStatement perintah = konekdb.prepareStatement(SQL);
        perintah.setString(1, idpelanggan);
        perintah.setString(2, idvendor);
        perintah.setString(3, jumlahtamu);
        perintah.setString(4, tanggalresepsi);
        perintah.setString(5, idpemesanan);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}


    public void hapuspemesanan(String idpemesanan) {
        try {
            String SQL = "DELETE FROM pemesanan WHERE id_pemesanan = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idpemesanan);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void simpanvendor(String idvendor, String namavendor, String pemilikvendor, String telpvendor, String alamat) {
        try {
            String SQL = "INSERT INTO vendor (id_vendor, namavendor, pemilikvendor, telpvendor, alamat) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idvendor);
            perintah.setString(2, namavendor);
            perintah.setString(3, pemilikvendor);
            perintah.setString(4, telpvendor);
            perintah.setString(5, alamat);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

 public void ubahvendor(String idvendor, String namavendor, String pemilikvendor, String telpvendor, String alamat) {
    try {
        String SQL = "UPDATE vendor SET namavendor = ?, pemilikvendor = ?, telpvendor = ?, alamat = ? WHERE id_vendor = ?";
        PreparedStatement perintah = konekdb.prepareStatement(SQL);
        perintah.setString(1, namavendor);
        perintah.setString(2, pemilikvendor);
        perintah.setString(3, telpvendor);
        perintah.setString(4, alamat);
        perintah.setString(5, idvendor);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Diubah");
    } catch (SQLException e) {
        System.out.println( e.getMessage());
    }
}



    public void hapusvendor(String idvendor) {
        try {
            String SQL = "DELETE FROM vendor WHERE id_vendor = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idvendor);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void caridatapesanan(String idkonten) {
        try {
            String SQL = "SELECT * FROM datapesanan WHERE id_konten = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idkonten);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("id_konten: " + data.getString("id_konten"));
                System.out.println("id_vendor: " + data.getString("id_vendor"));
                System.out.println("namakonten: " + data.getString("namakonten"));
                System.out.println("tipe: " + data.getString("tipe"));
                System.out.println("harga: " + data.getString("haga"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void datadatapesanan() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM datapesanan ORDER BY id_konten ASC");
            while (baris.next()) {
                System.out.println(baris.getString("id_konten") + " | " +
                                   baris.getString("id_vendor") + " | " +
                                   baris.getString("namakonten") + " | " +
                                   baris.getString("tipe") + " | " +
                                   baris.getString("harga"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void datapembayaran() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM pembayaran ORDER BY id_pembayaran ASC");
            while (baris.next()) {
                System.out.println(baris.getString("id_pembayaran") + " | " +
                                   baris.getString("status") + " | " +
                                   baris.getString("id_pesanan") + " | " +
                                   baris.getString("totalpembayaran"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void caripembayaran(String idpembayaran) {
        try {
            String SQL = "SELECT * FROM pembayaran WHERE id_pembayaran = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idpembayaran);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("id_pembayaran: " + data.getString("id_pembayaran"));
                System.out.println("status: " + data.getString("status"));
                System.out.println("id_pesanan: " + data.getString("id_pesanan"));
                System.out.println("totalpembayaran: " + data.getString("totalpembayaran"));
               
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
        public void caripemesanan(String idpemesanan) {
        try {
            String SQL = "SELECT * FROM pemesanan WHERE id_pemesanan = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idpemesanan);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("id_pemesanan: " + data.getString("id_pemesanan"));
                System.out.println("id_pelanggan: " + data.getString("id_pelanggan"));
                System.out.println("id_vendor: " + data.getString("id_vendor"));
                System.out.println("jumlahtamu: " + data.getString("jumlahtamu"));
                System.out.println("tanggalresepsi: " + data.getString("tanggalresepsi"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void datapemesanan() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM pemesanan ORDER BY id_pemesan ASC");
            while (baris.next()) {
                System.out.println(baris.getString("id_pemesan") + " | " +
                                   baris.getString("id_pelanggan") + " | " +
                                   baris.getString("id_vendor") + " | " +
                                   baris.getString("jumlahtamu") + " | " +
                                   baris.getString("tanggalresepsi"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
        public void carivendor(String idvendor) {
        try {
            String SQL = "SELECT * FROM vendor WHERE id_vendor = ?";
            PreparedStatement perintah = konekdb.prepareStatement(SQL);
            perintah.setString(1, idvendor);
            ResultSet data = perintah.executeQuery();
            while (data.next()) {
                System.out.println("id_vendor: " + data.getString("id_vendor"));
                System.out.println("namavendor: " + data.getString("namavendor"));
                System.out.println("pemilikvendor: " + data.getString("pemilikvendor")); 
                System.out.println("telpvendor: " + data.getString("telpvendor"));
                System.out.println("alamat: " + data.getString("alamat"));
                
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void datavendor() {
        try {
            Statement stmt = konekdb.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT * FROM vendor ORDER BY id_vendor ASC");
            while (baris.next()) {
                System.out.println(baris.getString("id_vendor") + " | " +
                                   baris.getString("namavendor") + " | " +
                                   baris.getString("pemilikvendor") + " | " +
                                   baris.getString("telpvendor") + " | " +
                                   baris.getString("alamat"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    
    }
}

    

