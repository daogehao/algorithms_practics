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
            return 1/dividConquer(x,Integer.MAX_VALUE)*x;
        }

        if( n < 0){
            return 1/dividConquer(x,-n);
        }else{
            return dividConquer(x,n);
        }
    }

    private double dividConquer(double x ,int n){
        if( n == 1) {
            return x;
        }
        double temp = 0;
        temp =  dividConquer(x,n/2);
        if( n % 2 == 0){
            return temp*temp ;
        }else {
            return temp*temp*x;
        }
    }


    public double myPowTeratiIon(double x, int n) {
        if(x == 0.0f){
            return 0.0d;
        }

        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }

        while(b > 0) {
            //举例说明，b=11,转换为二进制1011  11= 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0
            //x^11 = x^(8+0+2+1) = x^8 * x^0 * x^2 * x^1
            if((b & 1) == 1){
                //b $ 1 取二进制1011的最右一位
                res *= x;
                //当二进制的为0跳过，当二进制为1用来计算res*当前层数的x^n
            }
            x *= x;
            //用来计算x -> x^2 -> x^4 -> x^8

            //第一次循环 b=1   x=x     res=1*x^1
            //第二次循环 b=1   x=x^2   res=res*x^2=x^(1+2)=x^3;
            //第三次循环 b=0   x=x^4   res保持不变
            //第四次循环 b=1   x=x^8   res=res*x^8=x^(3+8)=x^11


            b >>= 1;
            //b>>1 代表将移除二进制1011的最右一位
        }
        return res;

    }
}
