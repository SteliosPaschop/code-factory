package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int DAY ;
        int MONTH;
        int YEAR;
        Scanner in = new Scanner(System.in);

        System.out.println("insert DAY, MONTH, YEAR");
        DAY = in.nextInt();
        MONTH = in.nextInt();
        YEAR = in.nextInt();
        YEAR = YEAR % 100;

        System.out.printf("The date is:  %02d / %02d / %d", DAY, MONTH, YEAR);
    }
}
