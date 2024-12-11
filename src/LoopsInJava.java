public class LoopsInJava {

    public static void main(String[] args) {
        // Loops in Java

        // Loops in Java allow you to execute a block of code repeatedly as long as a specified condition is true.
        // Java provides three main types of loops - for, while, and do-while loops

        // 1. for-loop
        // The for loop is used when you know in advance how many times you want to execute a statement or block of statements.

        // syntax
        // for (initialization; condition; update) {
            // code to be executed
        // }

        // where:
        // initialization - This happens only once, and it's usually used to initialize the loop counter
        // condition: if the condition is true, the loop continues - otherwise, it stops
        // update - Updates the loop counter at the end of each iteration

        // Example: output integers 1 2 3 4 5 using a for loop
        for (int x = 1; x <= 5; x++) {
            System.out.println(x); // 1 2 3 4 5
            // System.out.print(x + " ");
        }

        System.out.println();

        // Expected output: 60 45 30 15 0 -15 -30 -45 -60
        for (int x = 60; x >= -60; x -= 15) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Expected output: -2 0 2 4 6 8 10 12 14 16 18 20 22
        for (int x = -2; x <= 22; x += 2) {
            System.out.print(x + " ");
        }

        System.out.println();

        // 2. while loops
        // The while loop is used to execute a block of code repeatedly as long as a given condition is true. It is often used when you don't know the exact number of iterations beforehand.

        // syntax
        // while (condition) {
            // code to execute as long as the condition is true
        // }

        // Example: Output integers 1 2 3 4 5 using a while loop
        int x = 1;
        while (x <= 5) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println();

        // Expected output: 50 45 40 35 30 25 20 15 10 5 0
        int i = 50;

        while (i >= 0) {
            System.out.print(i + " ");
            i -= 5;
        }

        System.out.println();

        // 3. do ... while loops
        // The do-while loop is a variation of the while loop. The main difference is that the do-while loop executes the loop body at least once, even if the condition is false.

        // syntax
        // do {
           // code to execute (executes at least once)
        // } while (condition);

        // Example
        int number = 10;

        do {
            System.out.print(number + " ");
            number++;
        } while(number <= 5);

        System.out.println();

        // Break and Continue Statements

    }
}