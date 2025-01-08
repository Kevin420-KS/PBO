package PraktikumPBO.Sesi4;

class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;

    // Konstruktor dengan nama yang benar
    public Mobil(String aktifitas, String warna, int kecepatan) {
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan() {
        if (kecepatan == 0) {
            aktifitas = "parkir";
        }
    }

    void cetakAtribut() {
        System.out.println("Aktifitas = " + aktifitas);
        System.out.println("Warna = " + warna);
        System.out.println("Kecepatan = " + kecepatan);
    }
}

public class ClassMobil {
    public static void main(String[] args) {
        // Membuat objek mobilku dengan memberikan nilai untuk konstruktor
        Mobil mobilku = new Mobil("berjalan", "merah", 0);
        mobilku.cekKecepatan(); // Cek jika kecepatan 0, ubah aktifitas menjadi "parkir"
        mobilku.cetakAtribut(); // Cetak atribut mobilku
    }
}
