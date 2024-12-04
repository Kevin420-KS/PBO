package PraktikumPBO.Sesi10.Hewan;

import PraktikumPBO.Sesi10.Hewan.Anak.Ayam;
import PraktikumPBO.Sesi10.Hewan.Anak.Burung;
import PraktikumPBO.Sesi10.Hewan.Anak.Gurami;
import PraktikumPBO.Sesi10.Hewan.Anak.Kambing;
import PraktikumPBO.Sesi10.Hewan.Anak.Lele;
import PraktikumPBO.Sesi10.Hewan.Anak.Sapi;

public class Main {
    public static void main(String[] args) {
        // object untuk hewan sapi
        Sapi sapi = new Sapi();
        sapi.display();
        System.out.println("\n");

        // object untuk hewan kambing
        Kambing kambing = new Kambing();
        kambing.display();
        System.out.println("\n");

        // object untuk hewan ayam
        Ayam ayam = new Ayam();
        ayam.display();
        System.out.println("\n");

        // object untuk hewan burung
        Burung burung = new Burung();
        burung.display();
        System.out.println("\n");

        // object untuk hewan lele
        Lele lele = new Lele();
        lele.display();
        System.out.println("\n");

        // object untuk hewan gurami
        Gurami gurami = new Gurami();
        gurami.display();
    }
}
