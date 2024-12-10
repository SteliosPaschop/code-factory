package gr.aueb.cf.ch2;

/**
 *
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0 ;

        //caldulate jumps
        jumps = (int) Math.ceil((target - start) / (double) hop);
       // jumps = (target + start) / hop;//
        System.out.println("Jumps: " + jumps);

    }
}
