public class ContinueExample {
    public static void main(String[] args) {
        // A simple loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                // Skip the rest of the loop for even numbers
                continue;
            }

            // Print odd numbers
            System.out.println("Odd Number: " + i);
        }
    }
}
