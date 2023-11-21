package basic;

import java.util.Date;

public class VariableAndDataTypes {
    public static void main(String[] args) {

        // Primitive data types
        byte age = 23;
        long viewsCount = 1_123_456_789;
        float price = 234.56F;
        char gender = 'M';
        boolean isValid = true;
        System.out.println(age + " " + viewsCount + " " + price + " " + gender + " " + isValid);

        // Non-Primitive data types
        String name = "Abdul Wahid Muhaemin";
        Date now = new Date();
        System.out.println(name);
        System.out.println(now);

        // Point point1 = new Point(10, 20);
        // Point point2 = point1;
        // System.out.println(point1.x + " : " + point1.x);
    }

}
