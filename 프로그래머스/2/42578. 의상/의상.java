import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int result = 1;
        Map<String,Integer> map = new HashMap<>();
        
        for(String[] cloth : clothes){
            if(map.containsKey(cloth[1])){
                map.put(cloth[1], map.get(cloth[1])+1);  
            } else{
                map.put(cloth[1], 1);
            }
        }
        
        for(String key : map.keySet()){
             result *= map.get(key)+1;
        }
        
        return result-1; 
    }
}