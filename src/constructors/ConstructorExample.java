package constructors;

/**
 * Di Java, sebuah kelas dapat memiliki lebih dari satu jenis konstruktor,
 * dan ini dikenal sebagai overloading konstruktor.
 * Overloading konstruktor memungkinkan kelas untuk memiliki beberapa
 * konstruktor dengan parameter yang berbeda atau jumlah parameter yang berbeda.
 * Sebagai contoh, sebuah kelas dapat memiliki konstruktor tanpa parameter
 * (default constructor) dan konstruktor dengan parameter.
 */

class Student {

	private int studentId;
	private String studentName;
	private int studentAge;

	// Default Constructor
	public Student() {
		this.studentId = 56;
		this.studentName = "Abdul";
		this.studentAge = 24;
	}

	// Parameter Constructor
	public Student(int sId, String sName, int sAge) {
		this.studentId = sId;
		this.studentName = sName;
		this.studentAge = sAge;
	}

	void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge + "\n");
	}

}

public class ConstructorExample {

	public static void main(String[] args) {

		Student student = new Student();
		student.displayDetails();

		Student student2 = new Student(100, "Unknown", 23);
		student2.displayDetails();

	}

}