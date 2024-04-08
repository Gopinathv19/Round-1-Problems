//https://www.hackerrank.com/contests/stage-1-basics/challenges/removing-vowel-letters
import java.util.Scanner;

public class removingvowwels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(vowelsRemoved(s));
    }

    static String vowelsRemoved(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
