import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        /*홀짝을 구분하고 문자열로 변경 후 더한다.*/
        String even = Arrays.stream(num_list)
            .filter(a -> a % 2 == 1)
            .mapToObj(String::valueOf)
            .reduce("", (a ,b) -> a + b);
            
        String odd = Arrays.stream(num_list)
            .filter(a -> a % 2 == 0)
            .mapToObj(String::valueOf)
            .reduce("", (a ,b) -> a + b);
        
        return Integer.parseInt(even) + Integer.parseInt(odd);
            
    }
}