package PraktikumPBO.Sesi10.BangunDatar;

public class Lingkaran extends BangunDatar {
    private float jari;

    public void setJari(float jari) {
        if (jari >= 0) this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    @Override
    public double luas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public String toString() {
        return "Lingkaran";
    }
}
