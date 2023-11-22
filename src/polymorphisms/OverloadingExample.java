package polymorphisms;

public class OverloadingExample {
    // Metode dengan satu parameter tipe data int
    void add(int a) {
        System.out.println("Adding a single integer: " + a);
    }

    // Metode dengan dua parameter tipe data int
    void add(int a, int b) {
        System.out.println("Adding two integers: " + (a + b));
    }

    // Metode dengan dua parameter tipe data double
    void add(double a, double b) {
        System.out.println("Adding two doubles: " + (a + b));
    }

    // Metode dengan satu parameter tipe data String
    void concatenate(String a) {
        System.out.println("Concatenating a string: " + a);
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        // Memanggil metode dengan satu parameter
        example.add(5);

        // Memanggil metode dengan dua parameter int
        example.add(10, 20);

        // Memanggil metode dengan dua parameter double
        example.add(3.5, 7.5);

        // Memanggil metode dengan satu parameter String
        example.concatenate("Hello, World!");
    }
}
