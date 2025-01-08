package PraktikumPBO.Sesi5;

class Mobil {
    public String merk;                 // Public: bisa diakses dari mana saja
    protected int tahunProduksi;        // Protected: bisa diakses dari dalam package dan subclass
    private double harga;               // Private: hanya bisa diakses dalam kelas ini

    // Constructor
    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    // Getter untuk atribut private harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk atribut private harga
    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {            // Validasi harga baru harus positif
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    // Metode untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }
}

// Kelas utama untuk menjalankan program
public class MobilCek {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, 30000000);

        // Mengakses atribut public
        System.out.println("Merk Mobil: " + mobil1.merk);           // Output: Toyota

        // Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi);   // Output: 2022

        // Mengakses atribut private menggunakan getter
        System.out.println("Harga Mobil: " + mobil1.getHarga());    // Output: 30000000.0

        // Mengubah nilai atribut private menggunakan setter
        mobil1.setHarga(35000000);
        System.out.println("Harga Mobil Setelah Diubah: " + mobil1.getHarga()); // Output: 35000000.0

        // Menampilkan informasi lengkap mobil
        mobil1.tampilkanInfoMobil();
    }
}
