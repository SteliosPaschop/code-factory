package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Σικαίωμα ψήφου σε ηλικίες > 18
 * Ελέχγει αν μία ηλικία έχει δικαίωμα να ψηφίσει
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int VOTING_AGE = 18;
        int age = 0;
        boolean isEligible = false;

        System.out.println("Plesa insert your age :");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible : " + isEligible);



    }
}
