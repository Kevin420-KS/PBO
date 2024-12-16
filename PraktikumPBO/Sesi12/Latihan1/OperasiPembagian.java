package PraktikumPBO.Sesi12.Latihan1;

class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        if (b != 0) {
            this.c = this.a / this.b;
        } else {
            System.out.println("Error: Pembagian oleh nol!");
            this.c = Double.NaN; // Not a Number
        }
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pembagian: " + c);
    }
}
