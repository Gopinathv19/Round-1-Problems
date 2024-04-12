package Pattern;
import java.io.*;
import java.util.*;

public class  starPattern31 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int space=2;space<=row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++){
                if(row==1||col==1||col==n||row==n){
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
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\lib\idea_rt.jar=63960:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\gopin\OneDrive\Desktop\Gopinath\Hackerrank\out\production\Hackerrank Pattern.starPattern31
5
*****
 *   *
  *   *
   *   *
    *****

Process finished with exit code 0

 */