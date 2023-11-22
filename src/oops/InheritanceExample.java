package oops;

// Kelas dasar (superclass)
class Vehicle {
    String brand;

    // Konstruktor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Metode
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Subkelas pertama
class Car extends Vehicle {
    int numberOfDoors;

    // Konstruktor
    public Car(String brand, int numberOfDoors) {
        super(brand); // Memanggil konstruktor kelas dasar
        this.numberOfDoors = numberOfDoors;
    }

    // Override metode displayInfo
    @Override
    public void displayInfo() {
        // super.displayInfo(); // Memanggil metode displayInfo dari kelas dasar
        System.out.println("Type: Car");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subkelas kedua
class Motorcycle extends Vehicle {
    boolean hasSideCar;

    // Konstruktor
    public Motorcycle(String brand, boolean hasSideCar) {
        super(brand); // Memanggil konstruktor kelas dasar
        this.hasSideCar = hasSideCar;
    }

    // Override metode displayInfo
    @Override
    public void displayInfo() {
        // super.displayInfo(); // Memanggil metode displayInfo dari kelas dasar
        System.out.println("Type: Motorcycle");
        System.out.println("Has Side Car: " + hasSideCar);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Membuat objek-objek dari kelas turunan
        Car myCar = new Car("Toyota", 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley Davidson", false);

        // Memanggil metode displayInfo dari objek-objek tersebut
        System.out.println("Car Information:");
        myCar.displayInfo();

        System.out.println("\nMotorcycle Information:");
        myMotorcycle.displayInfo();
    }
}
