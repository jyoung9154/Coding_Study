class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < arr.length; i++){
            for(int[] query : queries){
                if(i%query[2] == 0 && query[0] <= i && query[1] >= i){
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}