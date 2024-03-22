
//https://www.hackerrank.com/contests/stage-1-basics/challenges/find-the-targey
import java.util.Scanner;


public class TargetIsSumOfTwoElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target;
        target = sc.nextInt();
        int[] ans = search(arr, target, n);
        if (ans[0] + ans[1] == -2) {
            System.out.println(-1);
        } else {
            System.out.println(ans[0] + "," + ans[1]);
        }

    }


    static int[] search(int[] arr, int target, int n) {
        int[] result = {-1, -1};
        for (int i = 0; i < n; i++) {
            for (int j = 1 + 1; j < n; j++) {
                if (target == arr[i] + arr[j]) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }
        return result;
    }
}
