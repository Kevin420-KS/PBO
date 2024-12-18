package PraktikumPBO.Sesi13.No1;

public class Dekan extends Dosen {
    private String fakultas;

    // Konstruktor
    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    // Getter untuk fakultas
    public String getFakultas() {
        return fakultas;
    }

    // Method view khusus untuk Dekan
    public void viewDekan() {
        view();
        System.out.println("Fakultas: " + fakultas);
    }
}
