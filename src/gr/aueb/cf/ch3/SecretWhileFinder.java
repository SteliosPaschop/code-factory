package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSucces = false;



        do{
            System.out.println("Insert a num to gues the secret");
            num = scanner.nextInt();

            if (num == SECRET){
                System.out.println("Secret found!!");
                isSucces = true;
            } else {
                System.out.println("Try again!!");
            }

        } while (!isSucces);



    }
}