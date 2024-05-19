import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    
        int[] result = new int[arr.length];
        System.arraycopy(arr, 0, result, 0, arr.length);

        for (int[] query : queries) {
            swap(result, query[0], query[1]);
        }

        return result;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}