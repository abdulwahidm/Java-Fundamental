package oops;

class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            System.out.println(age);
        } else {
            System.out.println("Invalid Age!");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Abdul");
        person.setLastName("Wahid");
        person.setAge(19);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        person.getAge();

    }

}
