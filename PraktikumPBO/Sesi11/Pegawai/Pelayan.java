package PraktikumPBO.Sesi11.Pegawai;

public class Pelayan extends Pegawai {
    public Pelayan(int idPegawai, String nama, String gaji) {
        super(idPegawai, nama, gaji);
    }

    public void tugas() {
        System.out.println("Tugas: Melayani dan menyajikan pesanan dari pembeli.");
    }
}
