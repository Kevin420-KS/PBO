package PraktikumPBO.Sesi10.BangunDatar;

public class Persegi extends BangunDatar {
    private float sisi;

    public void setSisi(float sisi) {
        if (sisi >= 0) this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }

    @Override
    public String toString() {
        return "Persegi";
    }
}
