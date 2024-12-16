package PraktikumPBO.Sesi10.Hewan.Anak;

import PraktikumPBO.Sesi10.Hewan.Ortu.Mamalia;

public class Kambing extends Mamalia {
    final private String nama, umur;

    public Kambing() {
        super();
        this.suara = "meeeee";
        this.nama = "Si Ling";
        this.umur = "2 tahun";
    }

    @Override
    public void display() {
        System.out.println("============Data Kambing============");
        super.display();
        System.out.println("Suara kambing: " + this.suara);
        System.out.println("Kambing bernama: " + this.nama + " berumur: " + this.umur);
    }
}
