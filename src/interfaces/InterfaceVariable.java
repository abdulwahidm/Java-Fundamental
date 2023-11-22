package interfaces;

interface MyInterface {
    // Interface field (constant)
    int MY_CONSTANT = 42;

    // Abstract method (to be implemented by classes)
    void myMethod();
}

// Implementasi interface
class MyClass implements MyInterface {
    // Implementasi dari abstract method
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }
}

public class InterfaceVariable {
    public static void main(String[] args) {
        // Mengakses interface field
        System.out.println("Interface constant: " + MyInterface.MY_CONSTANT);

        // Membuat objek dari kelas yang mengimplementasikan interface
        MyClass myObject = new MyClass();
        myObject.myMethod();
    }
}
