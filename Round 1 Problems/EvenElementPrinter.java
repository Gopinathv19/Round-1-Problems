//https://www.hackerrank.com/contests/1-array-basics/challenges/print-even-elements-in-array
import java.io.*;
import java.util.*;

public class  EvenElementPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        evenelementsprinter(array );
    }
    static void evenelementsprinter(int[]array){
        int count=0;
        int k=0;
        for(int n:array){
            if(n%2==0){
                count++;
            }
        }
        int[] arrayans=new int[count];
        for(int n:array){
            if(n%2==0){
                arrayans[k]=n;
                k++;
            }
        }

        for(int n:arrayans){
            System.out.print(n+" ");
        }
    }
}