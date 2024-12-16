package PraktikumPBO.Sesi6.Mahasiswa2;

import java.util.ArrayList;

class Jurusan {
    private String nama;
    private String kode;

    public Jurusan(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private int umur;
    private Jurusan jurusan;

    public Mahasiswa(String nama, String nim, int umur, Jurusan jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan.getNama() + " (" + jurusan.getKode() + ")");
    }
}

class Kelas {
    private String nama;
    private String kode;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public Kelas(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void displayInfo() {
        System.out.println("Nama Kelas: " + nama);
        System.out.println("Kode Kelas: " + kode);
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("- " + m.getNama() + " (" + m.getNim() + ")");
        }
    }
}

public class Mahasiswa2 {
    public static void main(String[] args) {
        Jurusan jurusanInformatika = new Jurusan("Informatika", "IF123");

        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21, jurusanInformatika);
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "87654321", 22, jurusanInformatika);

        Kelas kelasPemrograman = new Kelas("Pemrograman Java", "PJ101");
        Kelas kelasBasisData = new Kelas("Basis Data", "BD102");

        kelasPemrograman.addMahasiswa(mahasiswa1);
        kelasPemrograman.addMahasiswa(mahasiswa2);
        kelasBasisData.addMahasiswa(mahasiswa1);

        System.out.println("Informasi Mahasiswa:");
        mahasiswa1.displayInfo();
        mahasiswa2.displayInfo();

        System.out.println("\nInformasi Kelas:");
        kelasPemrograman.displayInfo();
        kelasBasisData.displayInfo();
    }
}
