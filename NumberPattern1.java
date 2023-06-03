package Javabatch.Pattern;

public class NumberPattern1 {
    public static void main(String[] args) {
        int rows = 5;

        // Initialize the first number
        int number = 1;

        for (int i = 0; i < rows; i++) {
            // Print each row
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
