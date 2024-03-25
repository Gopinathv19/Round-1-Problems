

//https://www.hackerrank.com/contests/stage-2/challenges/find-maximum-and-minimum-elements

import java.util.Scanner;
public class MaxandMininanArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[]array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(minArray(array,k));
        System.out.println(maxArray(array,k)+" "+minArray(array,k));
    }
    static int maxArray(int[]array,int k){
        int max=array[0];
        for(int i=1;i<k;i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        return max;
    }
    static int minArray(int[] array,int k){

        int min=array[0];
        for(int i=1;i<k;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
