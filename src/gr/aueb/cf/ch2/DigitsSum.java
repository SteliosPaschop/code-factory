package gr.aueb.cf.ch2;


import java.util.Scanner;

/**
 *  * Να λαμβάνει ως input από τον χρήστη ένα
 *  * διψήφιο ακέραιο και να υπολογίζει και να
 *  * εκτυπώνει το αθροισμα των ψηφίων του.
 *  * Για παράδειγμα, αν ο χρήστης δώσει τον ακέραιο 15,
 *  * θα πρέπει να του επιστρέψει το αποτελεσμα είναι:
 *  * 1 + 5 = 6
 */


 public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftdigit = 0;
        int rightdigit = 0;
        int inputNum ;
        int sum = 0;

        System.out.println("Please insert a two-digit integer");
        inputNum = in.nextInt();

        leftdigit = inputNum /10;  //Με div 10 παίρνουμε το αριστερό ψηφίο
        rightdigit = inputNum %10; // Με mod 10 παίρνουμε το δεξί ψηφίο
        sum = leftdigit + rightdigit;

        System.out.printf("Input num: %d, leftdigit: %d, Right digit: %d, Sum: %d",
                inputNum, leftdigit, rightdigit, sum);


    }
}
