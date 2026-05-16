package org.example;

public class LoopDemo {
    public static void main(String[] args) {

        // ─────────────────────────────────────────
        // FOR LOOP — when you know exact iterations
        // ─────────────────────────────────────────

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        // Output: 0, 1, 2, 3, 4

        // Anatomy of for loop:
        // for (initialization; condition; update)
        //      ↑ runs once    ↑ checked   ↑ runs after
        //                      each time    each body

        // Counting backwards
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        // Output: 10 9 8 7 6 5 4 3 2 1 0

        // ─────────────────────────────────────────
        // ENHANCED FOR LOOP (for-each) — for collections/arrays
        // ─────────────────────────────────────────

        String[] fruits = {"Apple", "Banan", "Grapes"};

        for (String fruit : fruits) {
            System.out.println("Fruits: " + fruit);
        }

        // ─────────────────────────────────────────
        // WHILE LOOP — when condition determines iterations
        // ─────────────────────────────────────────

        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Real-world use: reading user input until valid
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        int userInput;
//        while (true) {
//            System.out.print("Enter a number between 1-10: ");
//            userInput = scanner.nextInt();
//            if (userInput >= 1 && userInput <=10) {
//                break; // Valid input, exit loop
//            }
//            System.out.println(("Invalid! Try again."));
//        }
//
//        System.out.println("You entered: " + userInput);


        // ─────────────────────────────────────────
        // DO-WHILE LOOP — executes at least once
        // ─────────────────────────────────────────

        int attempt = 0;
        do {
            ++attempt;
            System.out.println("Attempt: " + attempt);
        } while (attempt < 3);

        // ─────────────────────────────────────────
        // BREAK AND CONTINUE
        // ─────────────────────────────────────────

        // break: exits the loop entirely
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            System.out.print(i + " "); // 0 1 2 3 4
        }

        System.out.println("\n");

        // continue: skips current iteration
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // ─────────────────────────────────────────
        // NESTED LOOPS
        // ─────────────────────────────────────────

        // Multiplication table
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
        // Output:
        //    1   2   3
        //    2   4   6
        //    3   6   9

        // ⚠️ Be careful with nested loops — O(n²) complexity!
        // We'll cover this in Module 1.2


    }
}
