//https://www.hackerrank.com/contests/stage-2/challenges/find-gcd-of-all-the-elements-and-maximum-number-in-that-
import java.io.*;
import java.util.*;

public class  GcdofaList {

    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         int size=sc.nextInt();
         int[] array=new int[size];
         for(int i=0;i<array.length;i++){
             array[i]=sc.nextInt();
         }
         int k=sc.nextInt();
        System.out.println(answer(array,k));

    }
    static int answer(int[] array, int k){
        int max=0;
        for(int i=0;i<array.length-1;i++){
            int a=greatherchecker(k,array[i]);
            if(a>max){
                max=a;
            }

        }
        return max;
    }
    static int  greatherchecker(int a, int b){
        if(a>b){
            return gcdchecker(a,b);
        }
        return gcdchecker(b,a);
    }
    static int gcdchecker(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return gcdchecker(b,a%b);
        }

    }
}