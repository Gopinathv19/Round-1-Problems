package Pattern;

import java.io.*;
import java.util.*;

public class starPatten4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\lib\idea_rt.jar=49161:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\gopin\OneDrive\Desktop\Gopinath\Hackerrank\out\production\Hackerrank Pattern.starPatten4
5
*****
*   *
*   *
*   *
*****

Process finished with exit code 0

 */