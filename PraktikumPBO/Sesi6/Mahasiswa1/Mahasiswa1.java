package PraktikumPBO.Sesi6.Mahasiswa1;

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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void displayInfo() {
        System.out.println("Nama Jurusan: " + nama);
        System.out.println("Kode Jurusan: " + kode);
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private int usia;
    private Jurusan jurusan;

    public Mahasiswa(String nama, String nim, int usia, Jurusan jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        if (jurusan != null) {
            jurusan.displayInfo();
        }
    }
}

public class Mahasiswa1 {
    public static void main(String[] args) {
        Jurusan jurusanInformatika = new Jurusan("Informatika", "IF123");
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21, jurusanInformatika);

        mahasiswa1.displayInfo();
    }
}
