package org.example;

public class TypeConversionDemo {
    public static void main(String[] args) {

        // ─────────────────────────────────────────
        // IMPLICIT (Widening) Conversion — Safe, automatic
        // ─────────────────────────────────────────
        //
        // byte → short → int → long → float → double
        //

        int intValue = 100;
        long longValue = intValue;  // int -> long, automatic
        double dbValue = intValue; // int -> double, automatic

        System.out.println(longValue);  // 100
        System.out.println(dbValue);  // 100.0

        // ─────────────────────────────────────────
        // EXPLICIT (Narrowing) Conversion — Risky, manual
        // ─────────────────────────────────────────

        double price = 9.99;
        int truncated = (int) price;  // MUST explicitly cast
        System.out.println(truncated); // 9 - decimal part LOST!


        long bigNum = 1234567890123L;
        int smallNum = (int) bigNum;  // DATA LOSS possible!
        System.out.println(smallNum);  // -539222987 - OVERFLOW!

        // ─────────────────────────────────────────
        // STRING CONVERSIONS
        // ─────────────────────────────────────────

        // Primitive → String

        int age = 25;
        String ageStr = String.valueOf(age);   // "25" - PREFERRED
        String ageStr2 = Integer.toString(age); // "25" - also fine
        String ageStr3 = "" + age;   // "25" - works but less clear

        System.out.println(ageStr);
        System.out.println(ageStr2);
        System.out.println(ageStr3);


        // String -> Primitive
        String numStr = "43";
        int num = Integer.parseInt(numStr); // 43
        double dbl = Double.parseDouble("3.14"); //3.14

        System.out.println(num);
        System.out.println(dbl);

        // parseXxx throws NumberFormatException if string isn't a valid number
        try {
            int bad = Integer.parseInt("abc");  // THROWS exception
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + e.getMessage());
        }
    }
}
