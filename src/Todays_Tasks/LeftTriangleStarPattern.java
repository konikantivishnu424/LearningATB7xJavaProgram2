package Todays_Tasks;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
           // Number of rows for the pattern
           //    *****
          //     ****
         //      ***
         //      **
         //      *
        int rows = 5;

        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Inner loop for each column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
