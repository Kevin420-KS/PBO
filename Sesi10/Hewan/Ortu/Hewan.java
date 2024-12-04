package PraktikumPBO.Sesi10.Hewan.Ortu;

public class Hewan {
    protected String suara;

    public Hewan(String suara) {
        this.suara = suara;
    }

    public void display() {
        System.out.println("Hewan bersuara: " + suara);
    }
}
