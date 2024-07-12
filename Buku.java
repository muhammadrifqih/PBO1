public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlah_halama;
    private double harga;

    public Buku() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public int getJumlah_halaman() {
        return this.jumlah_halama;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlah_halaman(int jumlah_halama) {
        this.jumlah_halama = jumlah_halama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}