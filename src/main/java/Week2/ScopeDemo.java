package Week2;

public class ScopeDemo {

    // CLASS-LEVEL (static) variable - accessible in all static methods
    static int globalCounter = 0;
    public static void demonstrateScope() {

        int x = 10;  // METHOD - level scope

        if ( x > 5) {
            int y = 20; // BLOCK-level scope - only exists inside this if block
            System.out.println(x); // Can access x from outer scope
            System.out.println(y); // Can access y within same block
        }

        System.out.println(x); // x still accessible
        // System.out.println(y); // COMPILE ERROR: y is out of scope

        globalCounter++; // Can access class-level variable
    }

    // ─────────────────────────────────────────
    // PASS BY VALUE — Java's argument passing
    // ─────────────────────────────────────────

    public static void tryToChangeInt(int number) {
        number = 100; // Only changes LOCAL copy
    }

    public static void tryToChangeArray(int[] array) {
        array[0] = 100; // Changes the ACTUAL array (objects pass reference)
    }

    public static void main(String[] args){

        // Primitive - pass by VALUE  (copy)
        int num = 42;
        tryToChangeInt(num);
        System.out.println(num); // Still 42! Method got a COPY

        // Ojbect/Array - pass reference by VALUE
        int[] arr = {1, 2, 3};
        tryToChangeArray(arr);
        System.out.println(arr[0]); // 100! The actual array was modified

    }
}
