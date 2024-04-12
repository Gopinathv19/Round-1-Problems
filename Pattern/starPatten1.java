package Pattern;
import java.io.*;
import java.util.*;

public class starPatten1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int row =1; row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();
        }
    }
}
