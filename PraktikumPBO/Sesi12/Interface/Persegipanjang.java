package PraktikumPBO.Sesi12.Interface;

public class Persegipanjang implements Bidang2D {
    public double panjang;
    public double lebar;

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }
}