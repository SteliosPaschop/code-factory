package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int Celsius = 0;
        int Farenait = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert temperature in Farenait:");
        Farenait = in.nextInt();
        Celsius = 5 * (Farenait - 32) / 9;

        System.out.println("The temperature in Celsius is :" + Celsius);

    }
}
