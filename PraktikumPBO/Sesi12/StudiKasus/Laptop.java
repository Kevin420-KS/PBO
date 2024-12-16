package PraktikumPBO.Sesi12.StudiKasus;

public class Laptop {
    protected String merk;
    protected String processor;
    protected int ram;

    public Laptop(String merk, String processor, int ram) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }
}
