package basic;

public class TypeCasting {

    public static void main(String[] args) {

        // Implicit casting
        int intValue = 10;
        long longValue = intValue;
        float floatValue = longValue;
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);

        // Explicit casting
        double doubleValue = 10.5;
        float floatValue2 = (float) doubleValue;
        long longValue2 = (long) floatValue2;
        int intValue2 = (int) longValue2;
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("floatValue: " + floatValue2);
        System.out.println("longValue: " + longValue2);
        System.out.println("intValue: " + intValue2);

    }

}
