
//https://www.hackerrank.com/contests/1-array-basics/challenges/merge-sort-32
import java.io.*;
import java.util.*;

public class   MergeandSort {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size1=sc.nextInt();
        int[] array1=new int[size1];
        for(int i=0;i<array1.length;i++){
            array1[i]=sc.nextInt();
        }
        int size2=sc.nextInt();
        int[] array2=new int[size2];
        for(int i=0;i<array2.length;i++){
            array2[i]=sc.nextInt();
        }

        sorter(merger(array1,array2));

    }

    static int[] merger(int[]array1,int[]array2){
        int len1=array1.length;
        int len2=array2.length;
        int[]array3=new int[len1+len2];
        int i=0;
        int k=0;
        int j=0;
        while(i<len1&&j<len2){
            if(array1[i]<array2[j]){
                array3[k]=array1[i];
                i++;
                k++;
            }
            else if(array2[j]<array1[i]){
                array3[k]=array2[j];
                k++;
                j++;
            }
            else{
                array3[k]=array1[i];
                i++;
                j++;
                k++;

            }
            while(i<len1){
                array3[k]=array1[i];
                k++;
                i++;
            }
            while(j<len2){
                array3[k]=array2[j];
                k++;
                j++;
            }
        }
        return array3;

    }
    static void sorter(int[] array3) {
        int n = array3.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array3[j] < array3[j + 1]) {
                    // swap array3[j] and array3[j+1]
                    int temp = array3[j];
                    array3[j] = array3[j + 1];
                    array3[j + 1] = temp;
                }
            }
        }
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }


}
