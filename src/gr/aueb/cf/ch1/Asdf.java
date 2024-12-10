package gr.aueb.cf.ch1;

public class Asdf {
    public static void main(String[] args) {
//        final int  HUNDREDS = 100;
//        int num = 1234;int a = num / HUNDREDS;
//        int b = num % HUNDREDS;
//        System.out.println(a + " " + b);

//        int i = 0;int result = 1;while (i < 3) {    result = result * i;    i++;}
//        System.out.println(result);
//        int i = 1;int result = 0;while (i < 3) {    result = result * i;    i++;}
//        System.out.println(result);

//        int i = 1;int result = 1;while (i < 1) {    result = result * i;    i++;}
//        System.out.println(result);
        int i = 1;
        int result = 1;
        boolean found = false;
        do {    result = result + i;    if (result == 7)  { found = true;}
            i++;} while ((i >= 1) && (! found)); System.out.println(i);
    }
}
