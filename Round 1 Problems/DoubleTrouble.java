//https://www.hackerrank.com/contests/1-array-basics/challenges/double-trouble-4-1
import java.util.Scanner;

public class DoubleTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        answer(array);
    }
    static void answer(int []array){
        int j=0;
        int k=0;
        int[] arrayans=new int[array.length];
        for(int i=0;i<array.length-1;i++){
            if(array[i]==array[i+1]){
                array[i]=2*array[i];
                array[i+1]=0;
            }
        }
        while(j<array.length){
            if (array[j]!=0){
            arrayans[k]=array[j];
            k++;
            }
            j++;
        }
        while(k<arrayans.length){
            arrayans[k]=0;
            k++;
        }
        for (int n : arrayans) {
            System.out.print(n + " ");
        }
    }

}
