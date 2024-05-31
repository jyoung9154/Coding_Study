import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
      
        int[] result = new int[commands.length];
        int i = 0;
        for(int[] command : commands){            
            int tmp[] = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(tmp);
            result[i] = tmp[command[2]-1];
            i++;
        }
        return result;
    }
}