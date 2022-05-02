package mathcalculator;

import java.util.*;

/**
 * 221534067
 *
 * @author logan kalib coghill
 */
public class MathCalculator {

    public static void main(String[] args) {

        int num1, num2, total;
        String choice;
        Scanner kbd = new Scanner(System.in);
        kbd.useLocale(Locale.ENGLISH);

        System.out.print("Please enter your first value: ");
        num1 = kbd.nextInt();

        System.out.print("Please enter your second value: ");
        num2 = kbd.nextInt();
        kbd.nextLine();
        System.out.println("==========================================================================");
        System.out.println("what whould you like to do?");
        System.out.println("A is to add");
        System.out.println("S is to subtract");
        System.out.println("D is to divide");
        System.out.println("M is to multiply");
        System.out.println("==========================================================================");
        System.out.print("please enter your choice: ");
        choice = kbd.nextLine();
        System.out.println("==========================================================================");
        switch (choice) {

            case "A":
            case "a":
                total = num1 + num2;
                System.out.println("Your choice was: " + choice);
                System.out.println(num1 + " Plus " + num2 + " is " + total);
                break;

            case "S":
            case "s":
                total = num1 - num2;
                System.out.println("Your choice was: " + choice);
                System.out.println(num1 + " Minus " + num2 + " is " + total);
                break;

            case "D":
            case "d":
                if (num1 == 0 || num2 == 0) {
                    System.out.println("ERROR! Cannot divivde by zero.");
                } else {
                    total = num1 / num2;
                    System.out.println("Your choice was: " + choice);
                    System.out.println(num1 + " Divided by " + num2 + " is " + total);
                }
                break;

            case "M":
            case "m":
                total = num1 * num2;
                System.out.println("Your choice was: " + choice);
                System.out.println(num1 + " Multiplied by " + num2 + " is " + total);
                break;

            default:
                System.out.println("ERROR! Valid choice not entered.");
        }
        kbd.close();

    }

}