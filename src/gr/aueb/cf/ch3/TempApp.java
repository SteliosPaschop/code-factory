package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μία τιμη  θερμοκρασίας απο τον χρήστη και εμφανίζει κατάλληλο μήνυμα
 */
public class TempApp {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("Please insert the current temperature");
        temp = inn.nextInt();

        isTempBelowZero = temp < 0 ;

        System.out.println(" Temperature is below zero:" + isTempBelowZero);


    }
}