//https://www.hackerrank.com/contests/stage-2/challenges/count-the-prime-number
import java.io.*;
import java.util.*;

public class PrimeCounter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(answer(n));

    }
    static int answer(int n){

        int count=0;
        while(n>0){
            int m=n%10;
            if(checker(m)){
                count++;

            }
            n/=10;
        }
        return count;
    }
    static boolean checker(int m){
        for(int i=2;i<m;i++){
            if(m>2 && m%i==0){
                return false;
            }
        }
        return true;
    }


}
