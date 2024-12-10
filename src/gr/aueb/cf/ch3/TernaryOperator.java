package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of ternary on common use case,
 * that is conditional assigment.
 * abs(num) alwys positive
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.println("Please insert a num");
        num = scanner.nextInt();
//
//        if (num >= 0) abs =num;
//        else abs = -num;

// Temporary Operator
        abs = (num >= 0) ? num : -num;
        System.out.println("abs: " + abs);
    }
}
