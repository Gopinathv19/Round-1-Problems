package Pattern;
import java.io.*;
import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int max=n;
        for(int row=max;row>=1;row--){

            for(int col=row;col<=max;col++){
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
}

/*
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
 */