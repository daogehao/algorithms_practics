import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author caifx
 * @create Created in 21:50 2020/8/17
 * @modified By:
 **/
class PowTest {


    @Test
    void myPowForce() {
        Pow pow =new Pow();
        double x = 2.0000d;
        int n = 10;
        assertEquals(pow.myPow(x,n) ,pow.myPowForce(x,n));

        n = -2;
        assertEquals(pow.myPow(x,n) ,pow.myPowForce(x,n));

        n = -2147483648;
        assertEquals(pow.myPow(x,n) ,pow.myPowForce(x,n));
    }

    @Test
    void myPowRecursion() {
        Pow pow =new Pow();
        double x = 2.0000d;
        int n = 10;
        assertEquals(pow.myPow(x,n) ,pow.myPowRecursion(x,n));

        n = -2;
        assertEquals(pow.myPow(x,n) ,pow.myPowRecursion(x,n));

        n = -2147483648;
        assertEquals(pow.myPow(x,n) ,pow.myPowRecursion(x,n));
    }

    @Test
    void myPowCycle() {
        int n = Math.abs(-2147483648);
        System.out.println( n );

    }
}