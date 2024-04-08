//https://www.hackerrank.com/contests/stage-1-basics/challenges/sum-of-characters-1-1
import java.util.Scanner;
public class Ascivalue {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int sum = calculateASCIISum(input);
            System.out.println(sum);
        }

        static int calculateASCIISum(String input) {
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                sum += (int) ch; // Adding ASCII value of each character to the sum
            }
            return sum;
        }
    }

