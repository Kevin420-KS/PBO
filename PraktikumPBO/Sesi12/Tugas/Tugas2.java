package Tugas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Mahasiswa implements Comparable<Mahasiswa> {
    String nrp;
    String nama;
    float nilai;

    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override
    public int compareTo(Mahasiswa other) {
        return Float.compare(other.nilai, this.nilai); // Urutkan secara descending
    }

    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama + ", Nilai: " + nilai;
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        Queue<Mahasiswa> queue = new LinkedList<>();
        Random rand = new Random();

        // Menambahkan data mahasiswa
        for (int i = 1; i <= 10; i++) {
            String nrp = "NRP" + i;
            String nama = "Mahasiswa" + i;
            float nilai = 60 + rand.nextFloat() * 40; // Random nilai antara 60-100
            queue.add(new Mahasiswa(nrp, nama, nilai));
        }

        // Menampilkan data sebelum diurutkan
        System.out.println("Data Mahasiswa Sebelum Diurutkan:");
        queue.forEach(System.out::println);

        // Memindahkan ke List untuk diurutkan
        LinkedList<Mahasiswa> mahasiswaList = new LinkedList<>(queue);
        mahasiswaList.sort(null); // Menggunakan Comparable untuk sorting

        // Menampilkan data setelah diurutkan
        System.out.println("\nData Mahasiswa Setelah Diurutkan (Berdasarkan Nilai):");
        mahasiswaList.forEach(System.out::println);
    }
}
