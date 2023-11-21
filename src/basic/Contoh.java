package basic;

public class Contoh {
    // Variabel statis
    static int hitung = 0;

    // Variabel instance lainnya
    int variabelInstance;

    // Konstruktor
    public Contoh() {
        hitung++; // Menambah variabel statis dalam konstruktor
        variabelInstance = 10; // Menginisialisasi variabel instance
    }

    public static void main(String[] args) {
        Contoh obj1 = new Contoh();
        System.out.println("Hitung: " + Contoh.hitung); // Mengakses variabel statis

        Contoh obj2 = new Contoh();
        System.out.println("Hitung: " + Contoh.hitung); // Hitung bersama di antara instance

        System.out.println("VariabelInstance dari obj1: " + obj1.variabelInstance); // Mengakses variabel instance
        System.out.println("VariabelInstance dari obj2: " + obj2.variabelInstance);
    }
}
