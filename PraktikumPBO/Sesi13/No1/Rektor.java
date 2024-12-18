package PraktikumPBO.Sesi13.No1;

public class Rektor extends Dosen {
    private int tahunMasuk;

    // Konstruktor
    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    // Getter untuk tahunMasuk
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // Method view khusus untuk Rektor
    public void viewRektor() {
        view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}
