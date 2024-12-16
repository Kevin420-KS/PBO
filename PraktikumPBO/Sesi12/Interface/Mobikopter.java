package PraktikumPBO.Sesi12.Interface;

public class Mobikopter implements Mobil, Helikopter {
    private String nama;

    public Mobikopter(String nama) {
        this.nama = nama;
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang");
    }
}
