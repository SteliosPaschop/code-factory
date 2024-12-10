package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calulates n!
 */
public record Factorial() {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("please insert input num");
        inputNum = in.nextInt();

        //facto
        while (i <= inputNum){
            facto *= i; //facts = facto * i
            i++;
        }
        System.out.println("Factorial : " + facto);
    }
}
