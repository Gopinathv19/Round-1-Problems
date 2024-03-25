//https://www.hackerrank.com/contests/stage-2/challenges/largest-word-and-its-length
import java.io.*;
import java.util.*;

public class  Largestword{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String sentence=new String();
        sentence=sc.nextLine();
        answer(sentence);
    }
    static void answer(String sentence){
        String[] word=sentence.split(" ");

        int answer=0;
        int count=0;
        for(int i=0;i<word.length;i++)
        {
            int tem=word[i].length();
            if(tem>answer){
                answer=tem;
                count=i;
            }

        }
        System.out.println(word[count]);
        System.out.println(answer);
    }

}