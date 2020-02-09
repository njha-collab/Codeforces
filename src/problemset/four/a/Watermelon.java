package problemset.four.a;

import java.util.Scanner;

/**
 * @author Narendra Jha
 *
 */
public class Watermelon {
    
    /*
     * Idea:
     * Any even number (except number 2) can be broken into two other even numbers
     * 
     * (w & 1) == 0 condition is equivalent to condition (w % 2) == 0
     * We are using more efficient bitwise operator instead of modulo operator to find remainder
     */
    
    private static String solution(int w) {
        return ((w & 1) == 0 && w > 2) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        System.out.println(solution(w));
        in.close();
    }
}
