package PraktikumPBO.Sesi12.Latihan3;

import PraktikumPBO.Sesi12.Latihan3.Anak.*;
import PraktikumPBO.Sesi12.Latihan3.Parent.Komputer;

final class KomputerCetak {
    final void cetak(Komputer[] obj) {
        for (Komputer k : obj) {
            k.hidupkan_os();
            k.klik_kiri();
            k.tekan_enter();
            k.cetak_data();
            k.matikan_os();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Komputer[] komputerList = new Komputer[] {
            new PC(),
            new Laptop(),
            new Netbook()
        };

        KomputerCetak cetak = new KomputerCetak();
        cetak.cetak(komputerList);
    }
}
