package PraktikumPBO.Sesi10.Hewan.Ortu;

public class Mamalia extends Hewan {
    protected String berkembangBiak;

    public Mamalia() {
        super("suara mamalia");
        this.berkembangBiak = "beranak";
    }

    @Override
    public void display() {
        System.out.println("Mamalia berkembang biak dengan cara: " + berkembangBiak);
    }
}
