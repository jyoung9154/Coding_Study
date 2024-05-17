class Solution {
    public String solution(int[] numLog) {

        StringBuilder res = new StringBuilder();
        for(int i = 1; i < numLog.length; i++){
            /* 앞 뒤의 차이를 구한 후*/
            int caseNum = numLog[i] - numLog[i-1];
    
            /* 조건에 대입 */
            switch(caseNum){
                case 1 : res.append("w"); break;
                case -1 :res.append("s"); break;
                case 10 : res.append("d"); break;
                case -10 : res.append("a"); break;
            }
        }
        return res.toString();
    }
}