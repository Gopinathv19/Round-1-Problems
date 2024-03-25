//https://www.hackerrank.com/contests/stage-2/challenges/decimal-to-binary-form
import java.io.*;
import java.util.*;

public class DecimaltoBinary {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(answer(n));
    }
    /*static int answer(int n){
        int factor=1;
        int ans=0;
        while(n!=0){
            ans+=(n%10)*factor;
            factor*=10;
            n/=10;
        }
        return ans;
    }*/
    static int answer(int n) {
        int factor = 1;
        int ans = 0;
        while (n != 0) {
            ans += (n % 2) * factor;
            factor *= 10;
            n /= 2;
        }
        return ans;
    }
}
