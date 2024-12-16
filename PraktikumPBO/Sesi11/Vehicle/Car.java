package PraktikumPBO.Sesi11.Vehicle;

// Subclass
public class Car extends Vehicle {
    int doors;

    // Constructor
    public Car(String brand, int doors) {
        super(brand); // Memanggil constructor superclass
        this.doors = doors;
    }

    // Overloading metode displayInfo
    public void displayInfo(String type) {
        super.displayInfo();
        System.out.println("Type: " + type + ", Doors: " + doors);
    }
}
