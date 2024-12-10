package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = in.next(); // διαβάζει μεχρι να βρει whitespace
        s2 = in.nextLine(); // diabazei m;exri na brei \n

        System.out.printf("s1: %\n", s1);
        System.out.printf("s2: %\n", s2);
    }
}
