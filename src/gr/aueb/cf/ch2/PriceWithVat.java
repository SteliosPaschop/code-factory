package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the prce with Vat
 */

public class PriceWithVat {
    public static void main(String[] args) {
        final double FPA = 0.24;
        double inputPrice = 0.0;
        double totalPrice = 0.0;
        double vat = 0.0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please Insert price");
        inputPrice = in.nextDouble();

        vat= inputPrice * FPA;
        totalPrice = inputPrice + vat;

        System.out.printf("Price : %.2f, VAT: %.2f, Total price: %.2f ", inputPrice, vat ,totalPrice );



    }
}
