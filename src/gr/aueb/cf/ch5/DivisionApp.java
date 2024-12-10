package gr.aueb.cf.ch5;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        double num ;
        double num2 ;
        double div = 0d;
        double mod = 0.0;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please insert two doubles");
        num = scanner.nextDouble();
        num2  = scanner.nextDouble();


        div = num / num2;
        mod = num % num2;

        System.out.printf("Div: %.2f\n", div);
        System.out.printf("Mod: %.2f", mod);
    }
}
