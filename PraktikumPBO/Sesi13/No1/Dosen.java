package PraktikumPBO.Sesi13.No1;

public class Dosen {
    protected String nik;
    protected String nama;

    // Konstruktor
    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Getter untuk nik
    public String getNik() {
        return nik;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Method view
    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}
