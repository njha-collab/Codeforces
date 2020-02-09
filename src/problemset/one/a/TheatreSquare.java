package problemset.one.a;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Narendra Jha
 *
 */
public class TheatreSquare {
    
    private static BigInteger solution(BigInteger m, BigInteger n, BigInteger a) {
        BigInteger mBlocks = m.divide(a); // number of squares required to cover width of m
        BigInteger nBlocks = n.divide(a); // number of squares required to cover height of n
        
        // when sides are not exactly divisible, we'll need one extra block
        // this also handles the case when m or n is smaller than a
        if (m.remainder(a) != BigInteger.ZERO) mBlocks = mBlocks.add(BigInteger.ONE);
        if (n.remainder(a) != BigInteger.ZERO) nBlocks = nBlocks.add(BigInteger.ONE);
        
        return mBlocks.multiply(nBlocks);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger m = in.nextBigInteger();
        BigInteger n = in.nextBigInteger();
        BigInteger a = in.nextBigInteger();
        System.out.println(solution(m, n, a));
        in.close();
    }

}
