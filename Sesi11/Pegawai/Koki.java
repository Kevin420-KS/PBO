package PraktikumPBO.Sesi11.Pegawai;

public class Koki extends Pegawai {
    public Koki(int idPegawai, String nama, String gaji) {
        super(idPegawai, nama, gaji);
    }

    public void tugas() {
        System.out.println("Tugas: Memasak makanan dan membuat minuman.");
    }
}
