//import java.util.List;
//import java.util.ArrayList;
//import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        /* 효율성 통과 못함 : 시간복잡도 O^2
        List<String> pList = Arrays.asList(participant);
        List<String> cList = Arrays.asList(completion); 
        
        List<String> resultList = new ArrayList<String>(pList); 
        
        
        for(String str1 : cList){
           for(String str2 : pList){
                resultList.remove(str1);   
                break;
           }
        }
        
        return resultList.get(0);
        */
        
        /* Hash로 풀어야 함 */
        // Map<사람이름,반복수>
        Map<String, Integer> map = new HashMap<>();
        
        /* 사람이름과 횟수 추가 */
        for(String name : participant){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        /* 완주자 횟수 감소 */
        for(String name : completion){
            map.put(name, map.get(name)-1);
        }
        
        /* 남은 사람 출력 */
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 0){
                return entry.getKey();
            }
        }
        
        return "";
    }
}