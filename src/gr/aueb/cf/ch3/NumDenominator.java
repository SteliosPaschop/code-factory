package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numenator = 0;
        int denominator = 0;
        int result = 0;
        while (true){
            System.out.println("Please insert numerator (Quit with Numirator = 0");
            numenator = scanner.nextInt();

            if (numenator == 0){
                    System.out.println("Numinator is zero. Quiting....");
                    break;

                }
            System.out.println("Please insert denominator");
            denominator = scanner.nextInt();

            if (denominator == 0){
                System.out.println("denominator must not be zero ");
                continue;
            }
            result = numenator / denominator;
            System.out.println("Result " + result);

        }
    }
}
