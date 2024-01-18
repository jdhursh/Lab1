/* This program takes a number and turns it into a shape that resembles a textbook.
 * */

public class Textbook2 {
    // CONSTANTS
    public static final int NUM = 8;
    public static final String L_SHAPE = "__/";
    public static final String SAYING = "Building Java Programs";
    public static final int SAYING_LENGTH = SAYING.length();

    public static void main(String[] args) {
        // Main method
        top();
        bottom();
    }

    public static void top() {
        // This method is for the top portion of the figure.

        //Height and Width of the figure
        int height = NUM;
        int width = NUM * 3;

        // Draw the top of the figure
        for (int i = 0; i <= height; i++) {
            int spacing = height - i;
            for (int j = 0; j <= spacing; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("+");
                for (int j = 0; j < width; j++) {
                    System.out.print("-");
                }
                System.out.print("+");
            } else {
                System.out.print("/");
            }
            for (int j = 0; j < width - (i * 3); j++) {
                if (i == 0) {
                    break;
                }
                System.out.print(" ");

            }
            if (i != 0) {
                System.out.print("_");

            }
            for (int j = 0; j < i; j++) {
                System.out.print(L_SHAPE);
            }
            for (int j = 1; j < i; j++) {
                System.out.print("/");
            }

            System.out.print("\n");
        }
    }

    public static void bottom() {
        // This method draws the bottom of the figure

        // Height and Width
        int height = (NUM / 2) + 2;
        int width = NUM * 3;

        // Draw bottom figure
        for (int i = 0; i < height; i++) {
            int spacing = (width - SAYING_LENGTH) / 2;

            if (i == 0 || i == (height - 1)) {
                System.out.print("+");
                for (int j = 0; j < width; j++) {
                    System.out.print("-");
                }
                System.out.print("+");
                if (i == 0) {
                    for (int j = 0; j < NUM; j++) {
                        System.out.print("/");
                    }
                }
            } else {
                System.out.print("|");
                for (int j = 0; j < spacing; j++) {
                    System.out.print(" ");
                }

                System.out.print(SAYING);

                for (int j = 0; j < spacing; j++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                for (int j = 0; j < NUM - (2 * i) + 2; j++) {
                    System.out.print("/");
                }
            }
            System.out.print("\n");
        }
    }
}
