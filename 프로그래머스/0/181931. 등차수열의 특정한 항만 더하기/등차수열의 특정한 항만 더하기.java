class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int result = 0;
        int count = included.length; 
        int[] arr = new int[count];
        
        // 길이만큼 반복
        for(int i = 0; i < count; i++){
            // 1항은 기본값 추가
            arr[i] = (i == 0) ? a : arr[i-1] + d;
            
            result += included[i] ? arr[i] : 0;
        }
        
        return result;
    }
}