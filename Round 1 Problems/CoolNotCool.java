import java.util.Arrays;

public class CoolNotCool {

    public static void main(String[] args) {
        int[] a = {2, 6, 3, 5};
        int n = a.length;
        int sum = Arrays.stream(a).sum(); // Calculate sum efficiently

        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int s = a[i] + a[j];
                int diff = sum - s;
                if (diff == s) {
                    flag++;
                }
            }
        }

        if (flag > 0) {
            System.out.println("cool");
        } else {
            System.out.println("not cool");
        }
    }
}

