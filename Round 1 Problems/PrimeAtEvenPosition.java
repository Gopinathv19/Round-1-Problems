//https://www.hackerrank.com/contests/stage-1-basics/challenges/print-the-odd-digit
import java.io.*;
import java.util.*;

public class  PrimeAtEvenPosition {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(answer(n));
    }

    static int answer(int n){
        int answer=0;
        String s=Integer.toString(n);
        int[]digits=new int[s.length()];
        for(int i=0;i<s.length();i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        for(int i=1;i<s.length();i+=2){

                answer=Oddreturner(digits[i]);
                if(answer!=-1){
                    return answer;
                }

            }

        return answer;


    }
    static int Oddreturner(int m){
        if(m%2==0){
            return -1;
        }
        return m;
    }
}
