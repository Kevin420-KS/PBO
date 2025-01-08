package PraktikumPBO.Sesi9.Pegawai;

import PraktikumPBO.Sesi9.Pegawai;

public class Manajer extends Pegawai {
    public Manajer(int idPegawai, String nama, String gaji) {
        super(idPegawai, nama, gaji);
    }

    public void tugas() {
        System.out.println("Tugas: Melakukan manajemen untuk franchise.");
    }
}
