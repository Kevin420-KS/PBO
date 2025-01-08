package Latihan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mahasiswa implements Comparable<Mahasiswa> {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nrp='" + nrp + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }

    @Override
    public int compareTo(Mahasiswa o) {
        return this.nama.compareTo(o.nama);
    }
}

public class LatihanMahasiswa {
    public static void main(String[] args) {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("001", "Diana"));
        mahasiswaList.add(new Mahasiswa("002", "Adam"));
        mahasiswaList.add(new Mahasiswa("003", "Charlie"));
        mahasiswaList.add(new Mahasiswa("004", "Budi"));

        // Menampilkan data pada list
        System.out.println("List awal:");
        for (Mahasiswa m : mahasiswaList) {
            System.out.println(m);
        }

        // Membalik data
        List<Mahasiswa> reversedList = new ArrayList<>(mahasiswaList);
        Collections.reverse(reversedList);
        System.out.println("\nList dibalik:");
        for (Mahasiswa m : reversedList) {
            System.out.println(m);
        }

        // Mengacak data
        List<Mahasiswa> shuffledList = new ArrayList<>(mahasiswaList);
        Collections.shuffle(shuffledList);
        System.out.println("\nList diacak:");
        for (Mahasiswa m : shuffledList) {
            System.out.println(m);
        }

        // Mengurutkan data
        List<Mahasiswa> sortedList = new ArrayList<>(mahasiswaList);
        Collections.sort(sortedList);
        System.out.println("\nList diurutkan:");
        for (Mahasiswa m : sortedList) {
            System.out.println(m);
        }
    }
}
