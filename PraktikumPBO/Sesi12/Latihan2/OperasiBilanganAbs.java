package PraktikumPBO.Sesi12.Latihan2;

abstract class OperasiBilanganAbs {
    protected double a, b, c;

    // Abstract methods
    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();
}