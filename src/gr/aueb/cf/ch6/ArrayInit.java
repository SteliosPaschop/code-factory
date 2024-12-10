package gr.aueb.cf.ch6;

/**
 * δήλωση κα αρχικοποίηση ενός πίνακα
 */

public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int[3];   //declare and initialization
        int[] arr2 = {1, 2, 3 ,4, 5}; //unsized initialization
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5};

        //populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;
        //traverse
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "");
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 


        }
    }
}
