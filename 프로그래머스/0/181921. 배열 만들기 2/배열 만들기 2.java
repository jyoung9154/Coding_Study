import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();
        // 5와 0만 포함하는 정규표현식
        Pattern pattern = Pattern.compile("^[50]*$");
            
        for (int i = l; i <= r; i++) {
            if (pattern.matcher(String.valueOf(i)).matches()) {
                result.add(i);
                System.out.println(result);
            }
        }
        
        if(result.size() == 0){
            result.add(-1);
        }

        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}