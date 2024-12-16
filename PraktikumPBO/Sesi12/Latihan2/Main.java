package PraktikumPBO.Sesi12.Latihan2;

public class Main {
    public static void main(String[] args) {
        double A = 6.5;
        double B = 0.5;

        OperasiBilanganAbs[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}
