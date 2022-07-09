package model;

public class Stok_obat {
    public static final String tabel = "stok_obat";
    public static final String where = "WHERE";
    public static final String like = "LIKE";
    public static final String selectAll = "SELECT * FROM";

    private String nama_barang;
    private String no_batch;
    private String PBF;
    private String jenis;
    private String satuan;
    private String jumlah_stok;
    private String tgl_msk;
    private String tgl_klr;
    private String exp;
    private String harga1;
    private String harga2;
    private String diskon;

    public Stok_obat(String nama_barang, String no_batch, String PBF, String jenis, String satuan, String jumlah_stok, String tgl_msk, String tgl_klr, String exp, String harga1, String harga2, String diskon) {
        this.nama_barang = nama_barang;
        this.no_batch = no_batch;
        this.PBF = PBF;
        this.jenis = jenis;
        this.satuan = satuan;
        this.jumlah_stok = jumlah_stok;
        this.tgl_msk = tgl_msk;
        this.tgl_klr = tgl_klr;
        this. exp = exp;
        this.harga1 = harga1;
        this.harga2 = harga2;
        this.diskon = diskon;
    }

    // public void Stok_obat(String nama_barang, String no_batch, String PBF, String jenis, String satuan, String jumlah_stok, String tgl_msk, String tgl_klr, String exp, String harga1, String harga2, String diskon){
    //     this.nama_barang = nama_barang;
    //     this.no_batch = no_batch;
    //     this.PBF = PBF;
    //     this.jenis = jenis;
    //     this.satuan = satuan;
    //     this.jumlah_stok = jumlah_stok;
    //     this.tgl_msk = tgl_msk;
    //     this.tgl_klr = tgl_klr;
    //     this. exp = exp;
    //     this.harga1 = harga1;
    //     this.harga2 = harga2;
    //     this.diskon = diskon;
    // }

    public String getNama_barang() {
        return nama_barang;
    }

    public String getNo_batch() {
        return no_batch;
    }

    public String getPBF() {
        return PBF;
    }

    public String getJenis() {
        return jenis;
    }

    public String getSatuan() {
        return satuan;
    }

    public String getJumlah_stok() {
        return jumlah_stok;
    }

    public String getTgl_msk() {
        return tgl_msk;
    }

    public String getTgl_klr() {
        return tgl_klr;
    }

    public String getExp() {
        return exp;
    }

    public String getHarga1() {
        return harga1;
    }

    public String getHarga2() {
        return harga2;
    }

    public String getDiskon() {
        return diskon;
    }

}
