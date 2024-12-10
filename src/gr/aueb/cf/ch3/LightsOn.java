package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark.
 *
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        boolean areLightsOn = false;
        int carSpeed = 0;

        Scanner in = new Scanner(System.in);

        System.out.println(" Insert if it is raining: ");
        isRaining = in.nextBoolean();
        System.out.println(" insert if it is dark: ");
        isDark = in.nextBoolean();

        System.out.println(" insert car speed");
        carSpeed = in.nextInt();

        isRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isRaining || isDark);

        System.out.println("Turn lights on :" + areLightsOn);

    }
}
