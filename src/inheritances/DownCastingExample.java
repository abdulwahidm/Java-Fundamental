package inheritances;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }

    @Override
    void start() {
        super.start();
        System.out.println("Car engine is running");
    }
}

public class DownCastingExample {
    public static void main(String[] args) {
        // Upcasting: Objek Car dianggap sebagai Vehicle
        Vehicle myVehicle = new Car();

        // Downcasting: Mengonversi objek kembali ke kelas turunannya (Car)
        Car myCar = (Car) myVehicle;

        // Memanggil metode dari kelas turunan
        myCar.start(); // Output: Vehicle is starting \n Car engine is running
        myCar.drive(); // Output: Car is driving
    }
}
