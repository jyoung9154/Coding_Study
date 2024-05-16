import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        return IntStream.of(arr)
            .map(a -> a >= 50 && a % 2 == 0 ? a / 2 :
                      a < 50 && a % 2 == 1 ? a * 2 : a)
            .toArray();
        
    }
}