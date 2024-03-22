
//https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1?page=1&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions
import java.util.ArrayList;
public  class ValueEqualtoIndex {
     public static ArrayList<Integer> valueEqualToIndex(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] arr2 = new int[arr.length];
        for (int i = 1; i <= arr.length; i++) {
            arr2[i-1] = i;
            if (arr[i-1] - arr2[i-1] == 0) {
                result.add(arr[i-1]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,42,33,54,86,62,76};
         System.out.println(valueEqualToIndex(arr));
    }
}
