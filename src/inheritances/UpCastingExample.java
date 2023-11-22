package inheritances;

// Super Class
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Subkelas
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class UpCastingExample {
    public static void main(String[] args) {
        // Upcasting: Objek Dog dianggap sebagai Animal
        Animal myAnimal = new Dog();

        // Memanggil metode dari kelas dasar
        myAnimal.eat();

        // Perhatikan bahwa kita tidak dapat memanggil metode bark(), karena itu
        // metode kelas turunan
        // myAnimal.bark(); // Ini akan menyebabkan kesalahan kompilasi
    }
}
