
//https://www.hackerrank.com/contests/stage-2/challenges/reverse-the-string-16
import java.io.*;
import java.util.*;

public class ReversingString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();




        System.out.println(reversing(s));
    }
    static String reversing(String s) {
        StringBuilder result = new StringBuilder(s);
        int i = 0;
        int j = result.length() - 1;
        while (i <= j) {
            char temp = result.charAt(i);
            result.setCharAt(i, result.charAt(j));
            result.setCharAt(j, temp);
            i++;
            j--;
        }
        return result.toString();
    }

}