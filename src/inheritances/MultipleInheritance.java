package inheritances;

interface Scholar {
    void study();
}

interface Athlete {
    void exercise();
}

class Person {
    void introduce() {
        System.out.println("I am a person.");
    }
}

class Student extends Person implements Scholar, Athlete {
    @Override
    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void exercise() {
        System.out.println("Student is exercising");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Student student = new Student();

        // Memanggil metode dari kelas turunan
        student.introduce(); // Output: I am a person.
        student.study(); // Output: Student is studying
        student.exercise(); // Output: Student is exercising
    }
}
