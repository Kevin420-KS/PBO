package PraktikumPBO.Sesi10.BangunDatar;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public void setAlas(float alas) {
        if (alas >= 0) this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        if (tinggi >= 0) this.tinggi = tinggi;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }

    @Override
    public String toString() {
        return "Segitiga";
    }
}
