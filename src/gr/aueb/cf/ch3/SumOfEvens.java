package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των άρτιων από το 2
 * μέχρι ένα άρτιο που δίνει ο χρήστης
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int  inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert Upper Limit: ");
        inputNum = scanner.nextInt();


        //sum

        while (i <= inputNum){
            sum +=i;
            i += 2;
            System.out.println(" the sum of numbers up to " + inputNum + " is: " + sum);

        }
    }



}
