package PraktikumPBO.Sesi13.No4;

abstract class Animal {
    private String nama;
    private String sifat;
    private int ukuran;

    public Animal(String nama) {
        this.nama = nama;
    }

    // Setter dan Getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }
}
