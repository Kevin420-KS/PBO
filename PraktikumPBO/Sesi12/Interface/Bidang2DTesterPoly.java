package PraktikumPBO.Sesi12.Interface;

public class Bidang2DTesterPoly {
    public static void main(String[] args) {
        Bidang2D bidang;

        Lingkaran l = new Lingkaran();
        l.radius = 10;

        BujurSangkar b = new BujurSangkar();
        b.sisi = 15;

        // Bidang2D sebagai lingkaran
        bidang = l;
        System.out.println("Lingkaran:");
        System.out.println("Luas: " + bidang.getLuas() + " Keliling: " + bidang.getKeliling());

        // Bidang2D sebagai bujursangkar
        bidang = b;
        System.out.println("Bujursangkar:");
        System.out.println("Luas: " + bidang.getLuas() + " Keliling: " + bidang.getKeliling());
    }
}
