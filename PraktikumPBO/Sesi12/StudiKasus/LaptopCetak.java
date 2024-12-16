package PraktikumPBO.Sesi12.StudiKasus;

public class LaptopCetak {
    public static void cetakSemua(Laptop[] laptops) {
        for (Laptop laptop : laptops) {
            laptop.tampilkanSpesifikasi();
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[3];
        laptops[0] = new LaptopAsus("Intel i5", 8);
        laptops[1] = new LaptopDell("AMD Ryzen 7", 16);
        laptops[2] = new LaptopToshiba("Intel i7", 12);

        cetakSemua(laptops);
    }
}
