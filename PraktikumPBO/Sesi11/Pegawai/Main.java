package PraktikumPBO.Sesi11.Pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat objek masing-masing subclass
        Manajer manajer = new Manajer(1, "Andi", "Rp10.000.000");
        Kasir kasir = new Kasir(2, "Budi", "Rp5.000.000");
        Koki koki = new Koki(3, "Citra", "Rp7.000.000");
        Pelayan pelayan = new Pelayan(4, "Dewi", "Rp4.000.000");
        Satpam satpam = new Satpam(5, "Eko", "Rp3.500.000");

        // Menampilkan data dan tugas masing-masing
        System.out.println("=== Data Manajer ===");
        manajer.menampilkan();
        manajer.tugas();

        System.out.println("\n=== Data Kasir ===");
        kasir.menampilkan();
        kasir.tugas();

        System.out.println("\n=== Data Koki ===");
        koki.menampilkan();
        koki.tugas();

        System.out.println("\n=== Data Pelayan ===");
        pelayan.menampilkan();
        pelayan.tugas();

        System.out.println("\n=== Data Satpam ===");
        satpam.menampilkan();
        satpam.tugas();
    }
}
