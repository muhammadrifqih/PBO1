public class Koran {
    private int id;
    private String nama;
    private String kategori;
    private int tahunTerbit;
    private double harga;

    public Koran() {
        System.out.println("Object telah diciptakan, constructor berjalan koran");
    }

    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getKategori() {
        return this.kategori;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

}
