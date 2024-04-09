//https://www.hackerrank.com/contests/1-array-basics/challenges/unite-1-1
import java.util.Scanner;
public class AppendingTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        merger(array1, array2);

    }

    static void merger(int[] array1, int[] array2) {
        int len1 = array1.length;
        int len2 = array2.length;
        int[] array3 = new int[len1 + len2];
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < len1)
        {
            array3[k] = array1[i];
            k++;
            i++;
        }
        while (j < len2) {
            array3[k] = array2[j];
            k++;
            j++;
        }
        for (int n : array3) {
            System.out.print(n + " ");
        }
    }
}
