package PraktikumPBO.Sesi12.Latihan1;

class OperasiBilanganCetak {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        double A = 10.5, B = 0.5;

        // Array untuk objek polimorfisme
        OperasiBilangan[] operasiBilangan = new OperasiBilangan[4];
        operasiBilangan[0] = new OperasiPenjumlahan();
        operasiBilangan[1] = new OperasiPengurangan();
        operasiBilangan[2] = new OperasiPerkalian();
        operasiBilangan[3] = new OperasiPembagian();

        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}