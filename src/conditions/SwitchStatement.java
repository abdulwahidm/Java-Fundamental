package conditions;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("admin - Get full acces");
        System.out.println("subadmin - Get acces to create/delete course");
        System.out.println("testprep - Get acces to create/delete test");
        System.out.println("user - Get acces to consume content");

        System.out.print("Enter your choice : ");
        String user = scanner.nextLine();

        switch (user) {
            case "admin":
                System.out.println("Get full acces");
                break;
            case "subadmin":
                System.out.println("Get full acces");
                break;
            case "testprep":
                System.out.println("Get full acces");
                break;
            case "user":
                System.out.println("Get full acces");
                break;
            default:
                System.out.println("You are a Trial User ");
                break;
        }

        scanner.close();

    }
}
