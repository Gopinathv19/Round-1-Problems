import java.util.Scanner;

public class ArrangingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(arranger(s));
    }

    static String arranger(String s) {
        String s2 = vowelgetter(s);
        StringBuilder sortedVowels = new StringBuilder(s2);

        for (int i = 0; i < sortedVowels.length() - 1; i++) {
            for (int j = i + 1; j < sortedVowels.length(); j++) {
                if (sortedVowels.charAt(i) > sortedVowels.charAt(j)) {
                    char temp = sortedVowels.charAt(i);
                    sortedVowels.setCharAt(i, sortedVowels.charAt(j));
                    sortedVowels.setCharAt(j, temp);
                }
            }
        }
        return sortedVowels.toString();
    }

    static String vowelgetter(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

