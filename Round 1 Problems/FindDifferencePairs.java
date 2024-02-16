import java.util.Scanner;

public class FindDifferencePairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the desired difference: ");
        int diff = scanner.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int d = Math.abs(a[i] - a[j]);
                if (diff == d) {
                    System.out.printf("Pair found: (%d, %d)\n", a[i], a[j]);
                }
            }
        }

        scanner.close();
    }
}

