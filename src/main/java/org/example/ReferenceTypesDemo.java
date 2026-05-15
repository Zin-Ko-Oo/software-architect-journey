package org.example;

public class ReferenceTypesDemo {
    public static void main(String[] args) {


        // STRING - Most commonly used reference type

        String firstName = "John";         // String literal (preferred)
        String lastName = new String("Doe"); // Explicit object (avoid this)


        // String concatenation
        String fullName = firstName + " " + lastName;   //"John Doe"
        String fullName2 = firstName.concat(" ").concat(lastName); // same result


        System.out.println(fullName);
        System.out.println(fullName2);


        // String is IMMUTABLE - once created, cannot be change
        String original = "Hello";
        String modified = original.toUpperCase();  // creates New string
        System.out.println(original);   // "Hello" - UNCHANGE
        System.out.println(modified); // 'HELLO'

        // IMPORTANT; == vs .equals() for String
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b); // true (same literal in string pool)
        System.out.println(a == c); // false (different objects in heap!)
        System.out.println(a.equals(c)); // ture (ALWAYS use .equals() for string

        // NULL - The Billion Dollar Mistake
        String name = "Zin Ko Oo";   // Variable exists but points to noting


        // This will throw NullPointerException;
        // System.out.pirntln(name.length()); // CASH!

        // Safe ways to handle null;
        if (name != null) {
            System.out.println(name.length());
        }

        // Or use Optional (modern Java);
        java.util.Optional<String> safeName = java.util.Optional.ofNullable(name);
        safeName.ifPresent(n -> System.out.println(n.length()));
    }
}
