package PraktikumPBO.Sesi13.No2;

// Superclass Gojek
public class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    // Method untuk menampilkan data
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga: " + harga);
    }

    // Method untuk mengatur data
    public void setData() {
        this.id = 1;
        this.harga = 50000;
    }

    // Method untuk mendapatkan ID
    public int getId() {
        return id;
    }
}
