import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        /*모든 원소들의 곱*/
        int case1 = Arrays.stream(num_list).reduce(1, (a,b) -> a * b);
        /*모든 원소들의 합의 제곱*/
        int case2 = (int)Math.pow(Arrays.stream(num_list).sum(),2);
        
        return case1 < case2 ? 1 : 0;
        
    }
}