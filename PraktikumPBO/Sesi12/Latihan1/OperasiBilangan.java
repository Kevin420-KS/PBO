package PraktikumPBO.Sesi12.Latihan1;

class OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = 0;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected void tampil() {
        System.out.println("Hasil Operasi: " + c);
    }
}