package inheritances;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating bone");
    }
}

public class DownCastingExample {
    public static void main(String[] args) {
        // Upcasting: Objek Dog dianggap sebagai Animal
        // Animal myAnimal = new Dog();

        // // Downcasting: Mengonversi objek kembali ke kelas turunannya (Dog)
        // Dog myDog = (Dog) myAnimal;

        // // Memanggil metode dari kelas turunan
        // myDog.bark(); // Output: Dog is barking
        // myDog.eat(); // Output: Dog is eating bone

        Dog yourDog = new Dog();
        yourDog.eat();
    }
}
