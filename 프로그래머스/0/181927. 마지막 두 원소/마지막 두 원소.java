import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
       int[] result = {};
        
        /* 배열 복사 및 길이 조절*/
        result = Arrays.copyOf(num_list, num_list.length+1);
        
        result[num_list.length] =
           num_list[num_list.length - 1] > num_list[num_list.length - 2] ?
           num_list[num_list.length - 1] - num_list[num_list.length - 2] : 
           num_list[num_list.length - 1] * 2;
        
        return result;
    }
}