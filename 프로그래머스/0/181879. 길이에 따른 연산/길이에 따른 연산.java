import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        IntStream list = Arrays.stream(num_list);
        
        return num_list.length > 10 ? list.sum(): list.reduce(1,(a,b) -> a * b);
    }
}