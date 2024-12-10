package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δινει ως  output ενος ακεραίου που δινει ο χρήστης μέ όλουε τους ακεραίους έως 10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println(" Enter an Integer");
        num = scanner.nextInt();


        while(i<= 10){
            //System.out.println(num +" * "+ i + " = " + (num * i));
            System.out.printf("%d * %2d = %d\n", num, i, num * i);
            i++;
        }


    }

}
