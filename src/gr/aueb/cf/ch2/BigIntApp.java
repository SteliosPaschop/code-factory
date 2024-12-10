package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo
 */
public class BigIntApp {
    public static void main(String[] args) {
       // Declerations and Initializations
        BigInteger bigNum1 = new BigInteger("12345678998454697453");
        BigInteger bigNum2 = new BigInteger("2345678945654412544444");
        BigInteger result;


        // Commands
        result = bigNum1.add(bigNum2);
        // Print
        System.out.printf("%,d", result);
    }
}
