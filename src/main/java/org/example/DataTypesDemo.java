package org.example;

public class DataTypesDemo {
    public static void main(String[] args) {

        // INTEGER TYPES (whole numbers)

        byte smallNumber = 127;       // 1 byte, range: -128 to 127
        short mediumNumber = 32767;   // 2 byte, range: -32,768 to 32,767
        int normalNumber = 2147483647; // 4 byte, range: ~-2.1B to 2.1B
        long bigNumber = 9223372036854775807L; // 8 bytes ← note the 'L' suffix

        float price1 = 9.99f;
        double price2 = 9.99;


        System.out.println(0.1 + 0.2);

        java.math.BigDecimal amount = new java.math.BigDecimal("0.10")
                .add(new java.math.BigDecimal("0.20"));
        System.out.println(amount);



        // BOOLEAN TYPE

        boolean isActive = true;
        boolean isExpired = false;
        boolean isLoggedIn = (1 == 1);

        // CHARACTER TYPE
        char grade = 'A';
        char letter = 65;
        char unicode = '\u0041';


        System.out.println(letter);
    }
}
