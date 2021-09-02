import java.util.Scanner;

/**
 * This program calculates change for a car wash.
 * 
 * @author Mr. King
 * @version 9/1/2021
 */

public class CarWashChange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double washValue, amountGiven;
        int valueInCents, givenInCents;
        int change, remaining;
        int dollars, quarters, dimes, nickels, pennies;

        System.out.print("Which wash would you like? (4.79, 15.47, 27.33) ");
        washValue = input.nextDouble();
        System.out.print("How much are you giving me? ");
        amountGiven = input.nextDouble();

        valueInCents = (int) (washValue * 100);
        givenInCents = (int) (amountGiven * 100);

        change = givenInCents - valueInCents;
        remaining = change;  //remaining change to give back to customer

        dollars = remaining / 100;
        remaining = remaining % 100;

        quarters = remaining / 25;
        remaining = remaining % 25;

        dimes = remaining / 10;
        remaining = remaining % 10;

        nickels = remaining / 5;
        remaining %= 5;

        pennies = remaining;

        System.out.println("Your " + (change / 100.0) + " in change consists of:");
        System.out.println(dollars + " dollar");
        System.out.println(quarters + " quarter");
        System.out.println(dimes + " dime");
        System.out.println(nickels + " nickel");
        System.out.println(pennies + " pennies");
    }
}

        /* Alternative Solution        
            
            Scanner input = new Scanner(System.in);
            double washValue, amountGiven;
            double change, remaining;
            int dollars, quarters, dimes, nickels, pennies;

            System.out.print("Which wash would you like? (4.79, 15.47, 27.33) ");
            washValue = input.nextDouble();
            System.out.print("How much are you giving me? ");
            amountGiven = input.nextDouble();

            change = amountGiven - washValue;
            remaining = change;  //remaining change to give back to customer

            dollars = (int) remaining;
            remaining = remaining - dollars;

            quarters = (int) (remaining / 0.25);
            remaining = remaining - 0.25 * quarters;

            dimes = (int) (remaining / 0.1);
            remaining = remaining - 0.1 * dimes;

            nickels = (int) (remaining / 0.05);
            remaining = remaining - 0.05 * nickels;

            pennies = (int) (remaining / 0.01);

            System.out.println("Your " + change + " in change consists of:");
            System.out.println(dollars + " dollar");
            System.out.println(quarters + " quarter");
            System.out.println(dimes + " dime");
            System.out.println(nickels + " nickel");
            System.out.println(pennies + " pennies");
        */

