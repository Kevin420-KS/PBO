package PraktikumPBO.Sesi11.Pegawai;

import PraktikumPBO.Sesi11.Pegawai;

public class Manajer extends Pegawai {
    public Manajer(int idPegawai, String nama, String gaji) {
        super(idPegawai, nama, gaji);
    }

    public void tugas() {
        System.out.println("Tugas: Melakukan manajemen untuk franchise.");
    }
}
