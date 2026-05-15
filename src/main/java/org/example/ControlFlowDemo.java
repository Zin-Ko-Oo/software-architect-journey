package org.example;

public class ControlFlowDemo {
    public static void main(String[] args) {

        // ─────────────────────────────────────────
        // BASIC IF-ELSE
        // ─────────────────────────────────────────

        int score = 75;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // ─────────────────────────────────────────
        // TERNARY OPERATOR — concise if-else
        // ─────────────────────────────────────────

        String result = (score >= 60) ? "Pass" : "False";
        // Read as: "if score >= 60 then 'Pass' else 'False'"
        System.out.println(result);

        // Good use of ternary (simple condition, clear meaning)
        int age = 25;
        String label = (age >= 18) ? "Adult" : "Minor";
        System.out.println(label);


        // ─────────────────────────────────────────
        // SWITCH STATEMENT
        // ─────────────────────────────────────────

        int dayofWeek = 3;

        // Traditional switch (Java 1.0+)
        switch (dayofWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }


        // Modern Switch Expression (Java 14+) - PREFER THIS
        String dayName = switch (dayofWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Tursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid day: " + dayofWeek);
        };
        System.out.println(dayName);



        // ─────────────────────────────────────────
        // LOGICAL OPERATORS
        // ─────────────────────────────────────────

        boolean isAdult = age >= 18;
        boolean hasPermission = true;
        boolean isLoggedIn = true;

        // AND (&&) - both must be true
        if (isAdult && hasPermission) {
            System.out.println("Access granted");
        }

        // OR (||) - at least one must be true
        if (isAdult || hasPermission) {
            System.out.println("Some access");
        }

        // NOT (!) - reverse boolean
        if (!isLoggedIn) {
            System.out.println("Please log in");
        }
        // Short-circuit evaluation - IMPORTANT!
        String user = "Zin Ko Oo";
        // This is SAFE because if user == null,
        // Java won't even evaluate user.isEmpty()
        if (user != null && !user.isEmpty()) {
            System.out.println("Valid user: " + user);
        }



    }
}
