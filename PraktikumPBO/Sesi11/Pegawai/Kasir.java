package PraktikumPBO.Sesi11.Pegawai;

public class Kasir extends Pegawai {
    public Kasir(int idPegawai, String nama, String gaji) {
        super(idPegawai, nama, gaji);
    }

    public void tugas() {
        System.out.println("Tugas: Melakukan transaksi dengan pembeli.");
    }
}
