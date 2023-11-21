package conditions;

public class IfStatement {

    public static void main(String[] args) {

        boolean isAuthenticated = false;

        if (isAuthenticated) {
            System.out.println("Loged in");
        }

        if (!isAuthenticated) {
            System.out.println("Not Loged in");
        }

    }

}
