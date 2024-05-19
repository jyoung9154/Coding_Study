import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            List<Integer> arrList = new ArrayList<>();
            int[] query = queries[i];
            
            for (int num : Arrays.copyOfRange(arr, query[0], query[1] + 1)) {
                if (num > query[2]) {
                    arrList.add(num);
                }
            }
            
            if (!arrList.isEmpty()) {
                result[i] = Collections.min(arrList);
            } else {
                result[i] = -1; // 배열이 비어있는 경우 -1 반환
            }
        }
        
        return result;
    }
}