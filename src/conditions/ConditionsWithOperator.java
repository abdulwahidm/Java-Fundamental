package conditions;

public class ConditionsWithOperator {

    public static void main(String[] args) {

        boolean isLoggedIn = true;
        boolean isEmailVerified = false;
        boolean isCardInfoValid = true;

        if (isLoggedIn && isEmailVerified && isCardInfoValid) {
            System.out.println("You are Allowed to make a purchase");
        } else {
            System.out.println("You are not allowed to make a purchse");
        }
    }

}
