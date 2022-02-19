/**
*  Console Calculator: 
*  Calculator has four options available: add, subtract, divide, or multiply.
*  Note: you would need to restart your console for every calculation made.  
*/

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        // Allows the program to interact with the user:
        Scanner scanner = new Scanner(System.in);
        // Welcoming message for the program:
        System.out.println("\nHello, welcome to the Console Calculator.");
        System.out.println("You can add, subtract, divide, or multiply with this program.");
        System.out.println("- @author Neil Purohit, 2-19-22\n");
        // Friendly user input-interaction with calculator:
        System.out.println("Lets start off with a good start, what is your name?");
        String username = scanner.nextLine();
        System.out.println("\nWell hi, " + username + "! What actions do you want to do?\n");
        // Gives user the command options:
        System.out.println("Your options are: add, subtract, divide, multiply.");
        // Checks for command action:
        checkNextAction();
        scanner.close();
    }

    /** Handles command input: */
    public static void checkNextAction() {
        // Creates scanner and converts it into string:
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        // Checks if string equals any certain word to trigger an action:
        if (command.equals("subtract")) {
            subtract();
        } else if (command.equals("add")) {
            add();
        } else if (command.equals("multiply")) {
            multiply();
        } else if (command.equals("divide")) {
            divide();
        } else {
            System.out.println("\nThat isn't an option. You command options are: add, subtract, divide, multiply.");
        }
        scanner.close();
    }

    /** Add two digits together method: */
    public static void add() {
        // Allows the method to interact with the user:
        Scanner scanner = new Scanner(System.in);
        try {
            // Asks for the first digit:
            System.out.println("\nType your first number here:");
            double numberOne = scanner.nextDouble();
            // Asks for the second digit:
            System.out.println("\nWhat do you want to add \"" + numberOne + "\" with?");
            double numberTwo = scanner.nextDouble();
            // Sum of both numbers typed:
            double addedNumber = numberOne + numberTwo;
            // Prints out the answer to the user:
            System.out.println("\nAnswer: " + addedNumber); 
            // Code is executed completely.
        } catch (Exception e) {
            // If a letter is typed, the console would throw this message:
            System.out.println("\nAn error happened... i.e. try not to input letters.");
        }
        scanner.close();
    }

    /** Subtracts two digits together method: */
    public static void subtract() {
        // Allows the method to interact with the user:
        Scanner scanner = new Scanner(System.in);
        try {
            // Asks for the first digit:
            System.out.println("\nType your first number here:");
            double numberOne = scanner.nextDouble();
            // Asks for the second digit:
            System.out.println("\nWhat do you want to subtract \"" + numberOne + "\" with?");
            double numberTwo = scanner.nextDouble();
            // Difference of both numbers typed:
            double subtractedNumber = numberOne - numberTwo;
            // Prints out the answer to the user:
            System.out.println("\nAnswer: " + subtractedNumber); 
            // Code is executed completely.
        } catch (Exception e) {
            // If a letter is typed, the console would throw this message:
            System.out.println("\nAn error happened... i.e. try not to input letters.");
        }
        scanner.close();
    }

    /** Multiplies two digits together method: */
    public static void multiply() {
        // Allows the method to interact with the user:
        Scanner scanner = new Scanner(System.in);
        try {
            // Asks for the first digit:
            System.out.println("\nType your first number here:");
            double numberOne = scanner.nextDouble();
            // Asks for the second digit:
            System.out.println("\nWhat do you want to multiply \"" + numberOne + "\" with?");
            double numberTwo = scanner.nextDouble();
            // Product of both numbers typed:
            double multipliedNumber = numberOne * numberTwo;
            // Prints out the answer to the user:
            System.out.println("\nAnswer: " + multipliedNumber); 
            // Code is executed completely.
        } catch (Exception e) {
            // If a letter is typed, the console would throw this message:
            System.out.println("\nAn error happened... i.e. try not to input letters.");
        }
        scanner.close();
    }

    /** Divides two digits together method: */
    public static void divide() {
        // Allows the method to interact with the user:
        Scanner scanner = new Scanner(System.in);
        try {
            // Asks for the first digit:
            System.out.println("\nType your first number here:");
            double numberOne = scanner.nextDouble();
            // Asks for the second digit:
            System.out.println("\nWhat do you want to divide \"" + numberOne + "\" with?");
            double numberTwo = scanner.nextDouble();
            // Quotient of both numbers typed:
            double dividedNumber = numberOne / numberTwo;
            // Prints out the answer to the user:
            System.out.println("\nAnswer: " + dividedNumber); 
            // Code is executed completely.
        } catch (Exception e) {
            // If a letter is typed, the console would throw this message:
            System.out.println("\nAn error happened... i.e. try not to input letters.");
        }
        scanner.close();
    }
}
