package PraktikumPBO.Sesi11.Pegawai;

public class Satpam extends Pegawai {
    public Satpam(int idPegawai, String nama, String gaji) {
        super(idPegawai, nama, gaji);
    }

    public void tugas() {
        System.out.println("Tugas: Menjaga keamanan di dalam dan di luar franchise.");
    }
}
