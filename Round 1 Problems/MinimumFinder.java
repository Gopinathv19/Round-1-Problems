//https://www.hackerrank.com/contests/stage-1-basics/challenges/minimum-in-an-array/submissions/code/1376631418
import java.io.*;
import java.util.*;
public class MinimumFinder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimum(arr,n));
    }
    static int minimum(int[] arr,int n){
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
}