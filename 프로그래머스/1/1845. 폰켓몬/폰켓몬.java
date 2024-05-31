import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(map.get(num),0));
        }
        
       return nums.length/2 < map.size() ? nums.length/2 : map.size();
            
        
    }
}