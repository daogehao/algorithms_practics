/**
 * @author caifx
 * @create Created in 21:46 2020/8/17
 * @modified By:
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 * Input: 2.00000, 10
 * Output: 1024.00000
 * Input: 2.10000, 3
 * Output: 9.26100
 * Input: 2.00000, -2
 * Output: 0.25000
 *               -2      2
 * Explanation: 2   = 1/2 = 1/4 = 0.25
 * Note:
 * -100.0 < x < 100.0
 * n is a 32-bit signed integer, within the range [−231, 231 − 1]
 **/
public class Pow {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }

    public double myPowForce(double x, int n) {
        if(n == 0 || x == 1){
            return 1;
        }
        if(x == 0 ){
            return 0;
        }

        double temp = x;
        boolean abs = false;
        if(n < 0){
            n *= -1 ;
            abs = true;
        }
        while (n-1 >0){
            temp *= x;
            n--;
        }
        return abs?1/temp:temp;

    }

    public double myPowRecursion(double x, int n) {
        if(n == 0 || x == 1){
            return 1;
        }
        if(x == 0 ){
            return 0;
        }
        if(n == Integer.MIN_VALUE){
            return 1/powRecursion(x,Integer.MAX_VALUE)*x;
        }

        if( n < 0){
            return 1/powRecursion(x,-n);
        }else{
            return powRecursion(x,n);
        }
    }

    private double powRecursion(double x ,int n){
        if( n == 1) {
            return x;
        }
        double temp = 0;
        temp =  powRecursion(x,n/2);
        if( n % 2 == 0){
            return temp*temp ;
        }else {
            return temp*temp*x;
        }
    }

    public double myPowCycle(double x, int n) {

        return 0;
    }
}
