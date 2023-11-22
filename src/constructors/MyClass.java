package constructors;

public class MyClass {
    private int value;

    // Konstruktor pertama (tanpa parameter)
    public MyClass() {
        // Panggil konstruktor kedua dengan nilai default
        this(0);
    }

    // Konstruktor kedua (dengan parameter)
    public MyClass(int value) {
        // Inisialisasi nilai
        this.value = value;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor pertama
        MyClass obj1 = new MyClass();
        obj1.displayValue();

        // Membuat objek menggunakan konstruktor kedua
        MyClass obj2 = new MyClass(42);
        obj2.displayValue();
    }
}
