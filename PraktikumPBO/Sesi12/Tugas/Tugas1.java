package Tugas;
import java.util.ArrayList;

public class Tugas1 {
    public static void main(String[] args) {
        // Membuat objek warna dan warnaDihapus
        ArrayList<String> warna = new ArrayList<>();
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");

        ArrayList<String> warnaDihapus = new ArrayList<>();
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        warnaDihapus.add("BLUE");

        // Menghapus warna yang ada di warnaDihapus dari warna
        warna.removeAll(warnaDihapus);

        // Menampilkan hasil
        System.out.println("Warna : " + warna);
    }
}
