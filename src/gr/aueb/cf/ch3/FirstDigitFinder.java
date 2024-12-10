package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρισκει το πρώτο αριστερά ψηφίο ενός ακεραιου
 */
public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int tempNum = 0;

        System.out.println("Enter a positive number: ");
        num = scanner.nextInt();

        tempNum = num;
        while (tempNum >= 10){
            tempNum /= 10; //

        }


        System.out.println("The first Digit of" + num + "is"+ tempNum);

    }
}
