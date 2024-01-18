/*
This program prompts the user to enter the date of the first Sunday of the month, and the number
of days in the month. Once receiving those inputs, it will generate an accurate calendar.
* */

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        // Call userInputs() method and store it in an array
        int inputs[] = userInputs();
        System.out.println();
        // Draw header
        header();
        System.out.println();
        // Draw accent
        accent();
        System.out.println();
        // Use inputs array to call dates() method
        dates(inputs[0], inputs[1]);
        // Draw accent
        accent();
        System.out.println();
    }


    public static void header() {
        // This method Draws the header of the calendar
        System.out.print("   ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    break;
                }
                System.out.print(" ");
            }
            switch (i) {
                case 0:
                    System.out.print("Sun");
                    break;
                case 1:
                    System.out.print("Mon");
                    break;
                case 2:
                    System.out.print("Tue");
                    break;
                case 3:
                    System.out.print("Wed");
                    break;
                case 4:
                    System.out.print("Thu");
                    break;
                case 5:
                    System.out.print("Fri");
                    break;
                case 6:
                    System.out.print("Sat");
                    break;
            }
        }
    }

    public static void accent() {
        // This method draws the accents of the calendar
        System.out.print("+");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
    }

    public static int[] userInputs() {
        /* This method prompts the user to enter the date of the first sunday, and the number
         of days on the month, and returns those inputs as an array. */

        // Create new Scanner
        Scanner console = new Scanner(System.in);

        // Prompt for first sunday
        System.out.print("Please enter the date of the first sunday (between 1 and 7): ");
        int first_sunday = console.nextInt();
        while (first_sunday < 1 || first_sunday > 7) {
            System.out.print("Please enter the date of the first sunday (between 1 and 7): ");
            first_sunday = console.nextInt();
        }
        System.out.println();

        // Prompt for days in the month
        System.out.print("Please enter number of days in the month (between 28 and 31): ");
        int num_of_days = console.nextInt();
        while (num_of_days < 28 || num_of_days > 31) {
            System.out.print("Please enter number of days in the month (between 28 and 31): ");
            num_of_days = console.nextInt();
        }

        // Return inputs as an array
        return new int[]{first_sunday, num_of_days};
    }

    public static void dates(int first_sunday, int num_of_days) {
        /* This method takes the date of the first sunday and the number of days in the month,
           and draws an accurate calendar based on those variables. */

        // method variables
        int num = 0;
        int row = 5;

        // Determines when to start putting numbers on the calendar
        if (first_sunday > 1) {
            num = first_sunday - 8;
        }

        // Determines how many rows there will be on the calendar
        if (first_sunday == 1 && num_of_days == 28){
            row = 4;
        } else if (first_sunday >=2 && first_sunday < 4 && num_of_days <= 31 && num_of_days > 29) {
            row = 6;
        }

        // Draws the calendar
        // Number of rows for loop
        for (int i = 0; i < row; i++) {

            System.out.print("|");

            // Places numbers in the correct space within the calendar
            for (int j = 0; j < 7; j++) {

                // Determines how many spaces to enter in each row
                if (num >= 0 && num < 9) {
                    for (int k = 0; k < 3; k++) {
                        System.out.print(" ");
                    }
                } else if (num >= 0 && num < num_of_days) {
                    for (int k = 0; k < 2; k++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int k = 0; k < 6; k++) {
                        System.out.print(" ");
                    }
                }

                // Ensures number of days stays between 1 and the number entered by the user
                if (num >= 0 && num < num_of_days) {
                    System.out.print(num + 1);
                    for (int k = 0; k < 2; k++) {
                        System.out.print(" ");
                    }
                }


                System.out.print("|");

                // Increases num variable
                num++;
            }
            System.out.println();
        }
    }
}

