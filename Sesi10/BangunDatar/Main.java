package PraktikumPBO.Sesi10.BangunDatar;

public class Main {
    public static void main(String[] args) {
        // Objek bangun datar
        BangunDatar persegi = new Persegi();
        BangunDatar persegiPanjang = new PersegiPanjang();
        BangunDatar lingkaran = new Lingkaran();
        BangunDatar segitiga = new Segitiga();

        // Set nilai atribut
        ((Persegi) persegi).setSisi(10);
        ((PersegiPanjang) persegiPanjang).setPanjang(10);
        ((PersegiPanjang) persegiPanjang).setLebar(5);
        ((Lingkaran) lingkaran).setJari(10);
        ((Segitiga) segitiga).setAlas(10);
        ((Segitiga) segitiga).setTinggi(5);

        // Cetak hasil
        BangunDatar[] bangunDatarArray = {persegi, persegiPanjang, lingkaran, segitiga};
        for (BangunDatar bgn : bangunDatarArray) {
            System.out.println("==== " + bgn.toString() + " ====");
            System.out.println("Luas: " + bgn.luas());
            System.out.println("Keliling: " + bgn.keliling());
        }
    }
}
 