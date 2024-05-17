
class Solution {
    public String[] solution(String[] names) {
        
         // 몇 개의 그룹인지 확인
         int n = (names.length+4)/5;
         String[] result = new String[n];
        
         // 첫 선두를 제외하고 나머지 선두 주입
         result[0] = names[0];
         for(int i = 1; i < n; i++){
           result[i] = names[i*5];
         }
  
        return result; 
    }
}