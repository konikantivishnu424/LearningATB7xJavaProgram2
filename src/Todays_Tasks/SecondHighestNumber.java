package Todays_Tasks;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        // Call the method to find the second highest salaries
        int secondHighest = findSecondHighestNumber(salaries);

        // Print the second highest salaries
        System.out.println("The second highest salaries is: " + secondHighest);
    }

    // Method to find the second highest salaries in an array
    public static int findSecondHighestNumber(int[] array) {
        // Check if the array has at least two elements
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        // Initialize the highest and second highest
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Loop through the array
        for (int number : array) {
            if (number > highest) {
                secondHighest = highest;
                highest = number;
            } else if (number > secondHighest && number < highest) {
                secondHighest = number;
            }
        }

        // Return the second highest number
        return secondHighest;
    }


    }

