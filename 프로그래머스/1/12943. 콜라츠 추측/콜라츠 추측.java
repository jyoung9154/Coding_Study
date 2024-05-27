class Solution {
    public int solution(int num) {
        /* 콜라츠 수열 예시 3번의 경우 무한 증식으로 인해 500회 반복하기 전에 int범위를 초과함*/
        long lNum = num;
        if(num == 1){
            return 0;
        }
        
        int cnt = 0; 
        while(lNum != 1){
            
            if(lNum % 2 == 0){
                lNum = lNum/2;
            }else{
                lNum = 3*lNum+1;
            }
            
            cnt++;
            
            /* 500회 이상 계산은 무의미함 */
            if(cnt > 500){
                return -1;
            }
        }
        
        return cnt;
    }
}