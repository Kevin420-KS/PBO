package PraktikumPBO.Sesi12.Latihan1;

class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = this.a * this.b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian: " + c);
    }
}