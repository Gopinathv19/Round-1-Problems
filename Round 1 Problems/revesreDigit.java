//https://www.hackerrank.com/contests/stage-1-basics/challenges/reverse-the-digit
import java.io.*;
import java.util.*;

public class  revesreDigit {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reversed(n));
    }
    static int reversed(int n){

        int ans=0;
        while(n>0){
       int m=n%10;
       if(evenchecker(m)){
           ans=ans*10+m;

       }
       n/=10;
        }
        return ans;

    }
    static boolean evenchecker(int m){
        if(m%2==0){
            return true;
        }
        return false;
    }
}