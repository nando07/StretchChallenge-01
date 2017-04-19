package gomez;
import com.sun.javaws.jnl.ResourcesDesc;

import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {

        CircleCalculator calculator = new CircleCalculator();
        float radius = calculator.getRadius();
        calculator.displayCircumference(radius);
        calculator.displayArea(radius);
    }

    private static Scanner scanner = new Scanner(System.in );

    public float getRadius() {

        /* 2. Don't forget to prompt the user */
        System.out.print( "Radius: " );

        // 3. Use the Scanner to read a line of text from the user.
        String input = scanner.nextLine();

        float r = Float.parseFloat(input);
        return r;
    }

    public void displayCircumference( float radius) {

        // takes the radius as a parameter, calculates the circumference, and displays it to two decimal places.
       double circumference = 2 * radius * Math.PI;

       System.out.printf("Circumference: " + "%.2f\n",circumference);
       // System.out.printf("%n");


    }

    public void displayArea(float radius) {

        // takes the radius as a parameter, calculates the circumference, and displays it to two decimal places.

        double area = radius * radius * Math.PI;

        System.out.printf("Area: " + "%.2f",area);
    }

}
