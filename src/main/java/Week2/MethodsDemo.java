package Week2;

public class MethodsDemo {

    //     Access   Return  Method     Parameters
    //     Modifier Type    Name       (input)
    //        ↓       ↓      ↓            ↓
    public static int addNumbers(int a, int b) {
        return  a + b; // <- return statement
    }

    // ─────────────────────────────────────────
    // DIFFERENT RETURN TYPES
    // ─────────────────────────────────────────

    // Returns nothing (void)
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
        // No return statement needed (for use bare 'return;')
    }

    // Returns a boolean
    public static boolean isEven(int number) {
        return  number % 2 == 0;
    }

    // Returns a String
    public static String getGrade(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    // ─────────────────────────────────────────
    // METHOD OVERLOADING
    // Same name, different parameters
    // ─────────────────────────────────────────

    public  static double calculateArea(double radius) {
        return  Math.PI * radius * radius; // Circle
    }

    public static double calculateArea(double width, double height) {
        return  width * height; // Rectangle
    }

    public static double calculateArea(double a, double b, double c) {
        // Triangle using Heron's formula
        double s = (a + b + c) / 2;
        return  Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }


    // ─────────────────────────────────────────
    // VARARGS — Variable number of arguments
    // ─────────────────────────────────────────

    public static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {

        // Calling methods
        int result = addNumbers(5, 6); // 11
        System.out.println(result);

        printGreeting("Zin Ko Oo");

        System.out.println(isEven(7));

        System.out.println(getGrade(99));

        // Calling overloaded methods
        System.out.println(calculateArea(5.0));  // Circle
        System.out.println(calculateArea(6.0, 2.0));  // Rectangle
        System.out.println(calculateArea(3, 4, 5)); // Triangle

        // Calling varargs
        System.out.println(sum(3, 4, 3)); //10
        System.out.println((sum(5, 6, 2))); // 13
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sum());

    }
}
