package PraktikumPBO.Sesi10.Hewan.Anak;

import PraktikumPBO.Sesi10.Hewan.Ortu.Mamalia;

public class Sapi extends Mamalia {
    final private String nama, umur;

    public Sapi() {
        super();
        this.suara = "moo";
        this.nama = "Ujang";
        this.umur = "1 tahun";
    }

    @Override
    public void display() {
        System.out.println("============Data Sapi============");
        super.display();
        System.out.println("Suara sapi: " + this.suara);
        System.out.println("Sapi bernama: " + this.nama + " berumur: " + this.umur);
    }
}
