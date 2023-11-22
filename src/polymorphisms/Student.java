package polymorphisms;

/**
 * Overloading juga dapat diterapkan pada konstruktor kelas.
 * Dalam hal ini, dua atau lebih konstruktor dalam kelas tersebut memiliki nama
 * yang sama, tetapi jumlah atau tipe parameter yang berbeda.
 */

public class Student {

    private int studentId;
    private String studentName;
    private int age;

    // Konstruktor tanpa parameter
    public Student() {
        this.studentId = 0;
        this.studentName = "Unknown";
        this.age = 0;
    }

    // Konstruktor dengan dua parameter
    public Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;
        this.age = 0; // Default age
    }

    // Konstruktor dengan tiga parameter
    public Student(int id, String name, int age) {
        this.studentId = id;
        this.studentName = name;
        this.age = age;
    }

    // Metode untuk menampilkan informasi siswa
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat objek siswa dengan konstruktor tanpa parameter
        Student student1 = new Student();
        student1.displayInfo();

        // Membuat objek siswa dengan konstruktor dua parameter
        Student student2 = new Student(1, "John");
        student2.displayInfo();

        // Membuat objek siswa dengan konstruktor tiga parameter
        Student student3 = new Student(2, "Alice", 20);
        student3.displayInfo();
    }
}
