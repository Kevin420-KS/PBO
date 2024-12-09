package PraktikumPBO.Sesi11.Pegawai;

public class Pegawai {
    int idPegawai;
    String nama;
    String gaji;

    // Constructor
    public Pegawai(int idPegawai, String nama, String gaji) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.gaji = gaji;
    }

    // Method menampilkan
    public void menampilkan() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
