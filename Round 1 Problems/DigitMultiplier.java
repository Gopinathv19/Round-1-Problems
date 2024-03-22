
//https://www.hackerrank.com/contests/stage-1-basics/challenges/question-number-2
import java.util.Scanner;

public class  DigitMultiplier {
    public static void main(String args[]) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(digitmultiplier(n));

    }

    static int digitmultiplier(int n) {
        int mul = 1;
        while (n > 0) {
            int g = n % 10;
            mul *= g;
            n /= 10;
        }
        return mul;
    }
}
