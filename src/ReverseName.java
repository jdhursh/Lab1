import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args){
        // Create Scanner
        Scanner console = new Scanner(System.in);

        // Prompt the user
        System.out.print("Please enter your full name: ");

        // Store user input into two different variables
        String firstname= console.next();
        String lastname= console.next();

        // Reverse user's name
        processName(firstname, lastname);
    }
    public static void processName(String firstname, String lastname){
        // This method takes the user's first and last name, and flips them around
        System.out.println("Your name reversed is " + lastname + ", " + firstname);
    }
}
