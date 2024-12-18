package PraktikumPBO.Sesi13.No4;

class Aves extends Animal implements Terbang {
    private String jenisAves;
    private boolean bisaTerbang;

    public Aves(String nama, double ukuran) {
        super(nama);
        setUkuran((int) ukuran);
    }

    @Override
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    @Override
    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }
}