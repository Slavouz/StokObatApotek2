package controller;
import java.sql.Statement;

import connection.Connect;
import model.Stok_obat;

public class StokObatController {
    Stok_obat tabel = new Stok_obat(null, null, null, null, null, null, null, null, null, null, null, null);
    Connect conn = new Connect();

        public void createController(String namaBarang, int no_batch, String pbf, String jenis, int satuan, int jumlahStok, String tglMsk, String tglKlr, String exp, int harga1, int harga2, int diskon){
            // System.out.println(
            // "Nama Barang = "+namaBarang+
            // "\nBatch = "+ no_batch+
            // "\nPBF = "+pbf+
            // "\nJenis = "+jenis+
            // "\nSatuan = "+satuan+
            // "\nJumlah = "+jumlahStok+
            // "\nTGL Msk = "+tglMsk+
            // "\nTGL Klr = "+tglKlr+
            // "\nEXP = "+exp+
            // "\nHarga1 = "+harga1+
            // "\ndHarga2 = "+harga2+
            // "\nDiskon = "+diskon);

            String query = "INSERT INTO "+tabel.tabel + 
            "VALUES "+"("+null+", '+"+namaBarang+"+', '"+no_batch+"', '"+pbf+"', '"+jenis+"', '"+satuan+"', '"+jumlahStok+"', '"+tglMsk+"', '"+tglKlr+"', '"+exp+"', '"+harga1+"', '"+harga2+"', '"+diskon+"');";
            // String query = "INSERT INTO "+tabel.tabel + 
            // "VALUES "+"("+null+", 'nama', '1', 'p', 'p', '1', '1', '1', '1', '1', '1', '1', '1');";

            try {
                Statement statement = conn.connection();
                statement.execute(query);
                System.out.println("berhasil tambah");
            } catch (Exception e) {
                System.out.println("gagal tambah");
                System.out.println(e.getMessage());
            }
        }

    public void updateController(){

    }

    public void deleteController(){

    }
    
    public void searchController(){

    }
}
