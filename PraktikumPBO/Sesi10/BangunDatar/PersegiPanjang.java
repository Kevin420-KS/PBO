package PraktikumPBO.Sesi10.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public void setPanjang(float panjang) {
        if (panjang >= 0) this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        if (lebar >= 0) this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public String toString() {
        return "Persegi Panjang";
    }
}
