package PraktikumPBO.Sesi10.Hewan.Ortu;

public class Unggas extends Hewan {
    protected String berkembangBiak;

    public Unggas() {
        super("suara unggas");
        this.berkembangBiak = "bertelur";
    }

    @Override
    public void display() {
        System.out.println("Unggas berkembang biak dengan cara: " + berkembangBiak);
    }
}
