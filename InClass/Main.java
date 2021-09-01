import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 10.15;
        double b = 7.13;
        int aInt = (int) (a * 100);
        int bInt = (int) (b * 100);
        int cInt = aInt - bInt;
        double diff = cInt / 100.0;
        double c = a - b;

        System.out.println(c);
        System.out.println(diff);

        /* ******************* */

        Scanner in = new Scanner(System.in);
        System.out.print("How many people are there? ");
        int people = in.nextInt();
        System.out.print("How many pieces of Hi Chew are there? ");
        int hiChew = in.nextInt();
        int each = hiChew / people;
        int leftOver = hiChew % people;
        System.out.println("Each person can have " + each + " pieces and there will be " + leftOver + " pieces left over.");
    }
}

