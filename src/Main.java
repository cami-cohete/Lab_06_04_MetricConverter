import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles = 0;
        double inches = 0;
        double feet = 0;
        String trash = "";

        System.out.print("Please enter a measurement in meters: ");
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an invalid integer: " + trash);
            System.out.println("Please run the program again and enter a valid integer!");
            System.exit(0);
        }

        miles = meters / 1609.344;
        System.out.printf("The entered measurement is %.2f in miles.\n", miles);

        inches = meters / 0.0254;
        System.out.printf("The entered measurement is %.2f in inches.\n", inches);

        feet = meters / 0.3048;
        System.out.printf("The entered measurement is %.2f in feet.\n", feet);

    }
}
