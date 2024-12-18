package PraktikumPBO.Sesi13.No2;

// Subclass Bayar yang mewarisi dari Gojek
public class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    // Konstruktor
    public Bayar() {
        this.jarak = 0;
        this.total = 0;
        this.nama = "Default";
    }

    // Method bayar dengan parameter id
    public void bayar(int id) {
        this.id = id;
        this.total = harga * jarak;
    }

    // Override method tampil untuk menampilkan data pembayaran
    @Override
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak);
        System.out.println("Total Bayar: " + total);
    }

    // Override method setData untuk mengatur data pembayaran
    @Override
    public void setData() {
        super.setData();
        this.jarak = 10; // Contoh jarak
        this.nama = "Bayu";
    }

    // Method untuk mendapatkan ID
    @Override
    public int getId() {
        return id;
    }
}

