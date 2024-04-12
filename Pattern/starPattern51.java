package Pattern;
import java.io.*;
import java.util.*;
public class starPattern51 {

        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            pattern(n);
        }
        static void pattern(int n){
            for(int row=1;row<=n;row++){
                for(int space=1;space<=n-row;space++){
                    System.out.print(" ");
                }
                for(int col=1;col<=n;col++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

